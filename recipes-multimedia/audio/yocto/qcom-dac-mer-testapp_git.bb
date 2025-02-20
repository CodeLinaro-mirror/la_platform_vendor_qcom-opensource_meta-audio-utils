inherit autotools pkgconfig

LICENSE = "BSD-3-Clause-Clear"
LIC_FILES_CHKSUM = "file://${QCOM_COMMON_LICENSE_DIR}${LICENSE};md5=3771d4920bd6cdb8cbdf1e8344489ee0"

DESCRIPTION = "DAC and Mercury codecs test app"

FILESPATH  =+ "${WORKSPACE}:"

SRC_URI = "file://audio/opensource/audio-utils/audio-plugins/test/dac_mer_test"
S = "${WORKDIR}/audio/opensource/audio-utils/audio-plugins/test/dac_mer_test"

SOLIBS = ".so"
FILES_SOLIBSDEV = ""

