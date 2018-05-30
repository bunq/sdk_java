# Change Log

## [0.13.1](https://github.com/bunq/sdk_java/tree/0.13.1)

[Full Changelog](https://github.com/bunq/sdk_java/compare/0.13.0...0.13.1)

**Closed issues:**

- Move to new sandbox [\#89](https://github.com/bunq/sdk_java/issues/89)


**Merged pull requests:**

- Changed sandbox url and pinned key.  [\#92](https://github.com/bunq/sdk_java/pull/92) ([OGKevin](https://github.com/OGKevin))

## [0.13.0](https://github.com/bunq/sdk_java/tree/0.13.0) [(2017-12-21)](https://github.com/bunq/sdk_java/tree/0.13.0)

[Full Changelog](https://github.com/bunq/sdk_java/compare/0.12.4...0.13.0)

**Implemented enhancements:**

- Add zappr integration for better quality control  [\#58](https://github.com/bunq/sdk_java/issues/58)
- Add more information to templates [\#56](https://github.com/bunq/sdk_java/issues/56)
- Add response id to error messages from failed requests  [\#55](https://github.com/bunq/sdk_java/issues/55)

**Fixed bugs:**

- Token request ideal is missing id attribute in response. [\#65](https://github.com/bunq/sdk_java/issues/65)
- getCounterpartyAlias\(\) returns null on payments [\#49](https://github.com/bunq/sdk_java/issues/49)
- Field ID is missing from MasterCardAction [\#48](https://github.com/bunq/sdk_java/issues/48)
- TokenQrRequestIdeal returns the wrong type [\#47](https://github.com/bunq/sdk_java/issues/47)
- Cannot list draft payments for monetary account [\#46](https://github.com/bunq/sdk_java/issues/46)

**Closed issues:**

- bunq update 7 [\#75](https://github.com/bunq/sdk_java/issues/75)
- Serialization Error [\#71](https://github.com/bunq/sdk_java/issues/71)
- Clean dependencies [\#25](https://github.com/bunq/sdk_java/issues/25)

**Merged pull requests:**

- Bunq update 7  [\#76](https://github.com/bunq/sdk_java/pull/76) ([OGKevin](https://github.com/OGKevin))
- Regenerate code for release [\#74](https://github.com/bunq/sdk_java/pull/74) ([OGKevin](https://github.com/OGKevin))
- Replaced httpclient with Okhttp. \(bunq/sdk\_java\#25\) [\#73](https://github.com/bunq/sdk_java/pull/73) ([OGKevin](https://github.com/OGKevin))
- Regenerated code to add corerct object types. \(bunq/sdk\_java\#47\) [\#70](https://github.com/bunq/sdk_java/pull/70) ([OGKevin](https://github.com/OGKevin))
- Fixed MonetaryAccountReferenceTypeAdapter to output proper value. \(bunq/sdk\_java\#49\) [\#68](https://github.com/bunq/sdk_java/pull/68) ([OGKevin](https://github.com/OGKevin))
- Added missing field id for TokenQrRequestIdeal. \(bunq/sdk\_java\#65\) [\#67](https://github.com/bunq/sdk_java/pull/67) ([OGKevin](https://github.com/OGKevin))
- Cannot list payments due to geolocation. \(Bunq/sdk\_java\#46 \) [\#64](https://github.com/bunq/sdk_java/pull/64) ([OGKevin](https://github.com/OGKevin))
- Get counterparty alias returns null on payments. \(Bunq/sdk\_java\#49 \) [\#63](https://github.com/bunq/sdk_java/pull/63) ([OGKevin](https://github.com/OGKevin))
- Added missing id field from mastercard action. \(bunq/sdk\_java\#48\) [\#62](https://github.com/bunq/sdk_java/pull/62) ([OGKevin](https://github.com/OGKevin))
- \(bunq/sdk\_java\#55\) add response id to request error [\#61](https://github.com/bunq/sdk_java/pull/61) ([OGKevin](https://github.com/OGKevin))
- Configure Zappr [\#59](https://github.com/bunq/sdk_java/pull/59) ([OGKevin](https://github.com/OGKevin))
- Improve issue and pr template. \(bunq/sdk\_java\#56\) [\#57](https://github.com/bunq/sdk_java/pull/57) ([OGKevin](https://github.com/OGKevin))

## [0.12.4](https://github.com/bunq/sdk_java/tree/0.12.4) (2017-12-21)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.12.3...0.12.4)

**Implemented enhancements:**

- Introduce fromJson method [\#51](https://github.com/bunq/sdk_java/issues/51)
- Make sure received signatures headers are correctly cased [\#43](https://github.com/bunq/sdk_java/issues/43)
- Remove guava  [\#41](https://github.com/bunq/sdk_java/issues/41)
- Return base class from createFromJsonString [\#40](https://github.com/bunq/sdk_java/issues/40)
- CHANGELOG.md is empty [\#38](https://github.com/bunq/sdk_java/issues/38)
- Improve decoder to recognise child object  [\#35](https://github.com/bunq/sdk_java/issues/35)
- Removed guava as dependency. \(bunq/sdk\_java\#41\) [\#44](https://github.com/bunq/sdk_java/pull/44) ([OGKevin](https://github.com/OGKevin))
- Generated CHANGELOG.md :clap:. \(bunq/sdk\_java\#38\) [\#39](https://github.com/bunq/sdk_java/pull/39) ([OGKevin](https://github.com/OGKevin))

**Fixed bugs:**

- Remove guava  [\#41](https://github.com/bunq/sdk_java/issues/41)
- Removed guava as dependency. \\(bunq/sdk\\_java\\#41\\) [\#44](https://github.com/bunq/sdk_java/pull/44) ([OGKevin](https://github.com/OGKevin))

**Merged pull requests:**

- Added method to ensure that reponse headers are correclty cased befor… [\#53](https://github.com/bunq/sdk_java/pull/53) ([OGKevin](https://github.com/OGKevin))
- Feature/improve decoder bunq/sdk java\#35 [\#52](https://github.com/bunq/sdk_java/pull/52) ([OGKevin](https://github.com/OGKevin))

## [0.12.3](https://github.com/bunq/sdk_java/tree/0.12.3) (2017-11-15)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.12.2...0.12.3)

**Implemented enhancements:**

- Callback models for holding callback data  [\#33](https://github.com/bunq/sdk_java/issues/33)
- Feature/callback models bunq/sdk java\#33 [\#36](https://github.com/bunq/sdk_java/pull/36) ([OGKevin](https://github.com/OGKevin))

**Fixed bugs:**

- ScheduledPayment causes decode error due to Typo [\#37](https://github.com/bunq/sdk_java/issues/37)

## [0.12.2](https://github.com/bunq/sdk_java/tree/0.12.2) (2017-11-08)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.12.0...0.12.2)

**Implemented enhancements:**

- Add missing fields for cvc endpoint [\#30](https://github.com/bunq/sdk_java/issues/30)
- Missing CARD GENERATED CVC2 endpoint [\#26](https://github.com/bunq/sdk_java/issues/26)
- More flexibility for sessionContext handling [\#23](https://github.com/bunq/sdk_java/issues/23)
- Added cvc\_endpoint. \#26 [\#27](https://github.com/bunq/sdk_java/pull/27) ([OGKevin](https://github.com/OGKevin))
- Added isExpired\(\) method \#23. [\#24](https://github.com/bunq/sdk_java/pull/24) ([OGKevin](https://github.com/OGKevin))

**Fixed bugs:**

- DraftPayment object field causes converter error  [\#29](https://github.com/bunq/sdk_java/issues/29)

**Merged pull requests:**

- Feature/fix draft payment object \#29 [\#32](https://github.com/bunq/sdk_java/pull/32) ([OGKevin](https://github.com/OGKevin))
- Feature/add missing cvc fields \#30 [\#31](https://github.com/bunq/sdk_java/pull/31) ([OGKevin](https://github.com/OGKevin))

## [0.12.0](https://github.com/bunq/sdk_java/tree/0.12.0) (2017-10-11)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.11.0...0.12.0)

**Implemented enhancements:**

- Update read me with installation instructions  [\#21](https://github.com/bunq/sdk_java/issues/21)
- Better error handling [\#17](https://github.com/bunq/sdk_java/issues/17)
- Response is missing response headers and pagination [\#4](https://github.com/bunq/sdk_java/issues/4)
- Feature/exception handler [\#18](https://github.com/bunq/sdk_java/pull/18) ([OGKevin](https://github.com/OGKevin))
- Marked all files in generated dir as generated code. [\#16](https://github.com/bunq/sdk_java/pull/16) ([OGKevin](https://github.com/OGKevin))

**Closed issues:**

- Improve Model Namespaces [\#19](https://github.com/bunq/sdk_java/issues/19)

**Merged pull requests:**

- cleanup after 19-improve-namespaces [\#22](https://github.com/bunq/sdk_java/pull/22) ([dnl-blkv](https://github.com/dnl-blkv))
- Fix namespaces; cleanup tests; kill formatting of generated files \[\#19\] [\#20](https://github.com/bunq/sdk_java/pull/20) ([dnl-blkv](https://github.com/dnl-blkv))

## [0.11.0](https://github.com/bunq/sdk_java/tree/0.11.0) (2017-09-06)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.10.0...0.11.0)

**Implemented enhancements:**

- Ignore generated code for reviews [\#14](https://github.com/bunq/sdk_java/issues/14)
- Added git attributes. [\#15](https://github.com/bunq/sdk_java/pull/15) ([OGKevin](https://github.com/OGKevin))

**Merged pull requests:**

- Add pagination; cleanup; add missing endpoints and fields \[\#4\] [\#13](https://github.com/bunq/sdk_java/pull/13) ([dnl-blkv](https://github.com/dnl-blkv))

## [0.10.0](https://github.com/bunq/sdk_java/tree/0.10.0) (2017-08-23)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.9.1...0.10.0)

**Implemented enhancements:**

- Add Proxy Support [\#11](https://github.com/bunq/sdk_java/issues/11)
- Allow saving context to JSON and restoring from it [\#9](https://github.com/bunq/sdk_java/issues/9)
- Add proxy support and missing .gitignore entry \[\#11\] [\#12](https://github.com/bunq/sdk_java/pull/12) ([dnl-blkv](https://github.com/dnl-blkv))
- add methods to save ApiContext to JSON and restore it from JSON \[\#9\] [\#10](https://github.com/bunq/sdk_java/pull/10) ([dnl-blkv](https://github.com/dnl-blkv))
- \#4 Introduce BunqResponse [\#5](https://github.com/bunq/sdk_java/pull/5) ([dnl-blkv](https://github.com/dnl-blkv))

**Fixed bugs:**

- SDK build fails on jitpack [\#6](https://github.com/bunq/sdk_java/issues/6)
- Fix Jitpack build, add misssing fields, fix field types in generated \[\#6\] [\#8](https://github.com/bunq/sdk_java/pull/8) ([dnl-blkv](https://github.com/dnl-blkv))

## [0.9.1](https://github.com/bunq/sdk_java/tree/0.9.1) (2017-08-08)
**Implemented enhancements:**

- Added tests readme [\#3](https://github.com/bunq/sdk_java/pull/3) ([OGKevin](https://github.com/OGKevin))
- Add first series of unit-tests [\#1](https://github.com/bunq/sdk_java/pull/1) ([OGKevin](https://github.com/OGKevin))



\* *This Change Log was automatically generated by [github_changelog_generator](https://github.com/skywinder/Github-Changelog-Generator)*