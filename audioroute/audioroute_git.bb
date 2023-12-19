SUMMARY = "Audioroute for AROSP"
LICENSE = "Apache-2.0 & BSD-3-Clause-Clear"
LIC_FILES_CHKSUM += "file://audio_route.c;beginline=2;endline=20;md5=e35892022a2de7b18b106d01dafe2f0c"

FILESPATH =+ "${WORKSPACE}/:"
SRC_URI = "file://audio/opensource/audio-utils/audio-route/"
S = "${WORKDIR}/audio/opensource/audio-utils/audio-route"
DEPENDS = "glib-2.0 tinyalsa expat"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

RM_WORK_EXCLUDE += "${PN}"

inherit autotools pkgconfig
