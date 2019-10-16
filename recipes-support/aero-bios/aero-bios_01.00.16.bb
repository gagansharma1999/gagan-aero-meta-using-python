DESCRIPTION = "BIOS for Intel Aero compute board"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=0557f9d92cf58f2ccdd50f62f8ac0b28"
PR = "r1"

SRC_URI = "file://BIOSUPDATE.fv \
		file://LICENSE \
	   "

do_install_append() {
	install -d ${D}/etc/bios
	install -m 0755 ${WORKDIR}/BIOSUPDATE.fv ${D}/etc/bios
}

FILES_${PN} += "/etc/bios/BIOSUPDATE.fv"
