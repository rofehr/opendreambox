require recipes/dreambox/dreambox-dvb-modules.inc

SRC_URI[modules.md5sum] = "3709e84fe5a59ff779dffab2847798bd"
SRC_URI[modules.sha256sum] = "a0d608479285ba2d46af3eda005b4108c5a6b29c08ff04c8362ba0145e592759"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
