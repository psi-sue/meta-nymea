SUMMARY = "nymea energy system"
DESCRIPTION = "Default packages for running a nymea energy system."
LICENSE = "MIT"

inherit packagegroup

RDEPENDS:${PN} = " \
    nymead \
    nymea-data \
    nymea-experience-plugin-energy \
    nymea-system-plugin-systemd \
    nymea-zeroconf-plugin-avahi \
    nymea-plugin-common-easee \
    nymea-plugin-common-evbox \
    nymea-plugin-common-everest \
    nymea-plugin-common-fronius \
    nymea-plugin-common-keba \
    nymea-plugin-common-mecelectronics \
    nymea-plugin-common-mystrom \
    nymea-plugin-common-openweathermap \
    nymea-plugin-common-powerfox \
    nymea-plugin-common-shelly \
    nymea-plugin-generic-genericcar \
    nymea-plugin-modbus-bgetech \
    nymea-plugin-modbus-huawei \
    nymea-plugin-modbus-inepro \
    nymea-plugin-modbus-inro \
    nymea-plugin-modbus-kostal \
    nymea-plugin-modbus-mennekes \
    nymea-plugin-modbus-pcelectric \
    nymea-plugin-modbus-phoenixconnect \
    nymea-plugin-modbus-schrack \
    nymea-plugin-modbus-sma \
    nymea-plugin-modbus-solax \
    nymea-plugin-modbus-sungrow \
    nymea-plugin-modbus-sunspec \
    nymea-plugin-modbus-vestel \
    nymea-plugin-modbus-wattsonic \
    nymea-plugin-modbus-webasto \
"
