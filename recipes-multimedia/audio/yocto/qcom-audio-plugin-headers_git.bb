inherit autotools pkgconfig

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=3771d4920bd6cdb8cbdf1e8344489ee0"

DESCRIPTION = "audio plugin headers"

FILESPATH  =+ "${WORKSPACE}:"

SRC_URI = "file://audio/opensource/audio-utils/audio-plugins/audio-plugin-headers"
S = "${WORKDIR}/audio/opensource/audio-utils/audio-plugins/audio-plugin-headers"

do_compile[noexec] = "1"

ALLOW_EMPTY:${PN} = "1"
