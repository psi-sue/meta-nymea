DESCRIPTION = "Yocto image for nymea"

IMAGE_FEATURES += "ssh-server-dropbear"

CORE_IMAGE_EXTRA_INSTALL = " \
    packagegroup-nymea \
"

inherit core-image
