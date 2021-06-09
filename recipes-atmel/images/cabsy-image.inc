IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    i2c-tools \
    devmem2 \
    gdb \
    wget \
    rng-tools \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image
