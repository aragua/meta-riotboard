IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

SPLASH = "psplash-aragua"

IMAGE_FEATURES += "ssh-server-openssh splash allow-empty-password package-management"

EXTRA_IMAGE_FEATURES += " debug-tweaks "

IMAGE_INSTALL += "kernel-modules"

IMAGE_INSTALL += "kbd kbd-keymaps"

IMAGE_INSTALL += "connman wireless-tools wpa-supplicant"