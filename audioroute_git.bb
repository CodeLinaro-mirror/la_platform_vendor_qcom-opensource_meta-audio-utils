SUMMARY = "Audioroute for AROSP"
LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM += "file://audio_route.c;beginline=2;endline=5;md5=042194586ded2562f74a6fb72983780f \
                     file://include/audio_route/audio_route.h;beginline=2;endline=4;md5=13471f57bede6a567f583ee39a0ba2a6"

FILESPATH =+ "${WORKSPACE}/:"
SRC_URI = "file://audio/opensource/audio-utils/audio-route/"
S = "${WORKDIR}/audio/opensource/audio-utils/audio-route"
DEPENDS = "glib-2.0 tinyalsa expat"
SOLIBS = ".so"
FILES_SOLIBSDEV = ""

RM_WORK_EXCLUDE += "${PN}"

inherit autotools pkgconfig
