DESCRIPTION = "nymea-system-plugin-systemd"
SUMMARY = "System plugin for nymea in order to use systemd services"
HOMEPAGE = "https://nymea.io"
BUGTRACKER = "https://github.com/nymea/nymea-remoteproxy/issues"

LICENSE = "LGPL-3.0-or-later | NYMEA-COMMERCIAL"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL3;md5=3000208d539ec061b899bce1d9ce9404"

SRC_URI = "git://github.com/nymea/nymea-system-plugin-systemd.git;protocol=https;branch=master"
# Release: 1.9.2
SRCREV = "949e87860edcba3eeda6969da0d4c35f1773123d"
PV = "1.9.2-git${SRCPV}"

DEPENDS += "nymea nymea-native systemd"
RDEPENDS:${PN} += "nymead tzdata"

inherit qmake5 pkgconfig

S = "${WORKDIR}/git"

FILES:${PN} += "${libdir}/nymea/platform/libnymea_systempluginsystemd.so"
