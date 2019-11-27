require cog.inc

DEFAULT_PREFERENCE = "-1"

PV = "git${AUTOREV}"
SRCREV = "${AUTOREV}"
SRC_URI = " git://github.com/Igalia/cog.git;protocol=https;branch=gbm"
S = "${WORKDIR}/git"
