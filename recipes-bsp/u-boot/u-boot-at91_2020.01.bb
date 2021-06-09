require u-boot-atmel.inc
require u-boot-envs-atmel.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=1;endline=22;md5=9915e8cb100eb5dbb366010a0f10296c"

#SRCREV = "af59b26c2241cb191ed0f57e4369ea718aa1dfac"
SRCREV = "6e159c74729dd564afb811cf421cf6681f1b0cd8"
SRCREV_sama7g5 = "8d2e69b3c0d924a68d2ae2c3a4cfa9a2c2a3171b"

PV = "v2020.01-at91+git${SRCPV}"

DEPENDS += "bison-native flex-native"

COMPATIBLE_MACHINE = '(ncx1-mk1|ncx1-mk1-sd|sama5d3xek|sama5d3-xplained|sama5d3-xplained-sd|at91sam9x5ek|at91sam9rlek|at91sam9m10g45ek|sama5d4ek|sama5d4-xplained|sama5d4-xplained-sd|sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc|sama5d2-ptc-ek|sama5d2-ptc-ek-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd|sama5d2-icp-sd|sam9x60ek|sam9x60ek-sd|sama5d27-wlsom1-ek-sd|sama7g5ek)'

UBRANCH = "u-boot-2020.01-ncx1"
UBRANCH_sama7g5 = "sama7g5_early"

SRC_URI = "git://github.com/devcabsy/u-boot-at91.git;protocol=https;branch=${UBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
