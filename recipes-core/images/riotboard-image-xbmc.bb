include recipes-core/images/core-image-base.bb

IMAGE_FEATURES += "debug-tweaks"

# SOC_EXTRA_IMAGE_FEATURES ?= "tools-testapps"
SOC_EXTRA_IMAGE_FEATURES=""

# Add extra image features
EXTRA_IMAGE_FEATURES += " \
    ${SOC_EXTRA_IMAGE_FEATURES} \
    nfs-server \
    tools-debug \
    tools-profile \
"

IMAGE_INSTALL += " \
    dropbear \
    xbmc \
    xbmc-nm-addon \
    networkmanager \
    procps \
    util-linux-mount \
    ntp \
    ntp-utils \
    util-linux \
    firmware-imx-vpu-imx6d \
    fsl-rc-local \
    packagegroup-core-sdk \
"
#IMAGE_INSTALL += " xbmc-image-custom-rfs "
#IMAGE_INSTALL += " tvheadend joe"

export IMAGE_BASENAME = "riotboard-image-xbmc"

