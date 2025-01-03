DESCRIPTION = "nymea-plugins-zigbee"

LICENSE = "LGPL-3.0-only | NYMEA-COMMERCIAL"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL3;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/nymea/nymea-plugins-zigbee.git;protocol=https;branch=master"
# Release: 1.8.1
SRCREV = "f4cd81d9a02e2bc2841d6014deebd220268dc3f6"
PV = "git${SRCPV}"

DEPENDS += "nymead nymead-native"

inherit qmake5 pkgconfig

S = "${WORKDIR}/git"

# PACKAGECONFIG options should **never** set WITH_PLUGINS in the leftmost argument
# PACKAGECONFIG[zigbeelumi] = ", WITHOUT_PLUGINS+=zigbeelumi"

EXTRA_QMAKEVARS_PRE += "${PACKAGECONFIG_CONFARGS}"

# One can find all available plugins by running oe-pkgdata-util list-pkgs nymea-plugins after having bitbake'd nymea-plugins
python populate_packages:prepend () {
    nymea_libdir = d.expand('${libdir}/nymea/plugins/')
    plugins = do_split_packages(d, nymea_libdir, r'^libnymea_integrationplugin(.*)\.so\.*', 'nymea-plugin-%s', 'Nymea integration plugin for %s', extra_depends='')

    # Make nymea-plugins-zigbee a meta package which RDEPENDS on all available nymea-plugin-zigbee*
    d.setVar('RDEPENDS:' + d.getVar('PN'), ' '.join(plugins))
}

ALLOW_EMPTY:${PN} = "1"
FILES:${PN} = ""

# Dynamically generate packages for all enabled plugins
PACKAGES_DYNAMIC = "^nymea-plugin-zigbee.*"
