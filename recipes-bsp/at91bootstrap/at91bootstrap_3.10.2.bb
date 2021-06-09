require at91bootstrap.inc

LIC_FILES_CHKSUM = "file://main.c;endline=27;md5=a2a70db58191379e2550cbed95449fbd"

COMPATIBLE_MACHINE = '(ncx1-mk1|ncx1-mk1-sd|sama5d3xek|sama5d3-xplained|sama5d3-xplained-sd|at91sam9x5ek|at91sam9rlek|at91sam9m10g45ek|sama5d4ek|sama5d4-xplained|sama5d4-xplained-sd|sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc|sama5d2-ptc-ek|sama5d2-ptc-ek-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd|sama5d2-icp-sd|sam9x60ek|sam9x60ek-sd|sama5d27-wlsom1-ek-sd|sama7g5ek)'

BBRANCH = "at91bootstrap-ncx1-3.0"

SRC_URI = "git://github.com/devcabsy/at91bootstrap.git;protocol=https;branch=${BBRANCH}"

PV = "3.10.2+git${SRCPV}"
#SRCREV = "8a54632f700cb858bb1f5a92d9a3c17fba080a46"
#SRCREV = "27a7be689f0709ddc6788ed4ee847d1ac31b7c57"
SRCREV = "519d53181fbac57dba73e4d34447bc19dd6b5acc"
S = "${WORKDIR}/git"
