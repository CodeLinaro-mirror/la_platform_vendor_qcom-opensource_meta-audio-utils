inherit autotools pkgconfig

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=3771d4920bd6cdb8cbdf1e8344489ee0"

DESCRIPTION = "Audio DAC Plugin"

FILESPATH  =+ "${WORKSPACE}:"

SRC_URI = "file://audio/opensource/audio-utils/audio-plugins/dac_plugin"

S = "${WORKDIR}/audio/opensource/audio-utils/audio-plugins/dac_plugin"

EXTRA_OECONF:append:qcs8300 = " --enable-qcs8300=yes "

DEPENDS = "qcom-audio-plugin-headers"

SOLIBS = ".so*"
FILES_SOLIBSDEV = ""
INSANE_SKIP:${PN} = "dev-so"
