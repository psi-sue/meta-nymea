SUMMARY = "Generic nymea installation with all plugins and InfluxDB"
DESCRIPTION = "Installs nymea with a default nymea plugin set."
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = " \
    nymead \
    nymea-data \
    nymea-plugins \
    nymea-plugins-modbus \
    nymea-experience-plugin-energy \
    nymea-system-plugin-systemd \
    nymea-zeroconf-plugin-avahi \
    influxdb \
"
