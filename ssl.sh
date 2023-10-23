keytool -genkeypair -alias soa -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore soa_lab2_LabService/src/main/resources/keystore/soa.p12 -validity 3650
cp soa_lab2_LabService/src/main/resources/keystore/soa.p12 soa_lab2_BarsService/src/main/resources/keystore
