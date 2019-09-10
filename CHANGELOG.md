# Change Log

## [Unreleased](https://github.com/bunq/sdk_java/tree/HEAD)

[Full Changelog](https://github.com/bunq/sdk_java/compare/1.10.16...HEAD)

**Closed issues:**

- NullPointerException on creating NotificationFilterUrlUser [\#117](https://github.com/bunq/sdk_java/issues/117)

**Merged pull requests:**

- Fix NotificationFilter and implement PSD2 [\#118](https://github.com/bunq/sdk_java/pull/118) ([NickvandeGroes](https://github.com/NickvandeGroes))

## [1.10.16](https://github.com/bunq/sdk_java/tree/1.10.16) (2019-06-16)
[Full Changelog](https://github.com/bunq/sdk_java/compare/1.10.1...1.10.16)

## [1.10.1](https://github.com/bunq/sdk_java/tree/1.10.1) (2019-05-22)
[Full Changelog](https://github.com/bunq/sdk_java/compare/1.10.0...1.10.1)

**Closed issues:**

- Support for MonetaryAccountBankSavings is missing [\#113](https://github.com/bunq/sdk_java/issues/113)

## [1.10.0](https://github.com/bunq/sdk_java/tree/1.10.0) (2019-05-09)
[Full Changelog](https://github.com/bunq/sdk_java/compare/1.1.0...1.10.0)

**Closed issues:**

- Certificate pinning issue after bunq certificate renewal [\#115](https://github.com/bunq/sdk_java/issues/115)
- Used package javax.xml.bind not included in Android [\#111](https://github.com/bunq/sdk_java/issues/111)

**Merged pull requests:**

- Changed pinned key to match new sandbox certificate  [\#116](https://github.com/bunq/sdk_java/pull/116) ([erwindeg](https://github.com/erwindeg))

## [1.1.0](https://github.com/bunq/sdk_java/tree/1.1.0) (2018-10-09)
[Full Changelog](https://github.com/bunq/sdk_java/compare/1.0.1...1.1.0)

**Merged pull requests:**

- bunq header handling as enum \(bunq/sdk\_java\#93\)  [\#105](https://github.com/bunq/sdk_java/pull/105) ([tubbynl](https://github.com/tubbynl))

## [1.0.1](https://github.com/bunq/sdk_java/tree/1.0.1) (2018-09-01)
[Full Changelog](https://github.com/bunq/sdk_java/compare/1.0.0...1.0.1)

**Closed issues:**

- 1.0.0 build aild on jitpack [\#109](https://github.com/bunq/sdk_java/issues/109)

**Merged pull requests:**

- Exclude examples and test files from build. \(bunq/sdk\_java\#109\) [\#110](https://github.com/bunq/sdk_java/pull/110) ([OGKevin](https://github.com/OGKevin))

## [1.0.0](https://github.com/bunq/sdk_java/tree/1.0.0) (2018-07-24)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.13.1...1.0.0)

**Implemented enhancements:**

- \[Java\] Update examples in readme  [\#81](https://github.com/bunq/sdk_java/issues/81)
- Add test CI [\#80](https://github.com/bunq/sdk_java/issues/80)
- It is not possible to refresh userContext data [\#79](https://github.com/bunq/sdk_java/issues/79)
- Optimise test framework [\#78](https://github.com/bunq/sdk_java/issues/78)
- Add more example scripts [\#66](https://github.com/bunq/sdk_java/issues/66)
- Auto save the session after automatic session reset has been executed  [\#60](https://github.com/bunq/sdk_java/issues/60)
- Add optional parameters to constructor  [\#50](https://github.com/bunq/sdk_java/issues/50)
- Monetary account joint cannot be retrieved. [\#45](https://github.com/bunq/sdk_java/issues/45)
- Add java 7 compatibility  [\#42](https://github.com/bunq/sdk_java/issues/42)
- Endpoint HTTP methods should not be static  [\#34](https://github.com/bunq/sdk_java/issues/34)
- Remove the examples from the published artifacts  [\#2](https://github.com/bunq/sdk_java/issues/2)

**Fixed bugs:**

- SDK build fails on jitpack [\#6](https://github.com/bunq/sdk_java/issues/6)

**Closed issues:**

- Java 7 compatibility: java.util.Base64 [\#104](https://github.com/bunq/sdk_java/issues/104)
- Please share code formatter [\#103](https://github.com/bunq/sdk_java/issues/103)
- expose ApiEnvironmentType members and add pinnedKey [\#100](https://github.com/bunq/sdk_java/issues/100)
- Add oauth support [\#107](https://github.com/bunq/sdk_java/issues/107)
- Update Sandbox API key procedure [\#96](https://github.com/bunq/sdk_java/issues/96)
- Move to new sandbox [\#89](https://github.com/bunq/sdk_java/issues/89)
- Can not construct a BunqMeTabEntry to create a BunqMeTab [\#77](https://github.com/bunq/sdk_java/issues/77)

**Merged pull requests:**

- Add java 7 support bunq/sdk\_java\#42 [\#106](https://github.com/bunq/sdk_java/pull/106) ([OGKevin](https://github.com/OGKevin))
- Oauth bunq/sdk\_java\#107 [\#108](https://github.com/bunq/sdk_java/pull/108) ([OGKevin](https://github.com/OGKevin))
- \#100 moved pinnedKey to ApiEnvironmentType [\#101](https://github.com/bunq/sdk_java/pull/101) ([tubbynl](https://github.com/tubbynl))
- UserContext building without static references. \(bunq/sdk\_java\#93\) [\#99](https://github.com/bunq/sdk_java/pull/99) ([tubbynl](https://github.com/tubbynl))
- Update Sandbox API key procedure. \(bunq/sdk\_java\#96\) [\#97](https://github.com/bunq/sdk_java/pull/97) ([sandervdo](https://github.com/sandervdo))
- Add constructor with request field bunq/sdk\_java\#50 [\#95](https://github.com/bunq/sdk_java/pull/95) ([OGKevin](https://github.com/OGKevin))
- Changed sandbox url and pinned key. \(bunq/sdk\_java\#89\) [\#92](https://github.com/bunq/sdk_java/pull/92) ([OGKevin](https://github.com/OGKevin))
- Fix monetary account joint retrieval bunq/sdk\_java\#45 [\#91](https://github.com/bunq/sdk_java/pull/91) ([OGKevin](https://github.com/OGKevin))
- Auto update bunq context bunq/sdk\_java\#60 [\#90](https://github.com/bunq/sdk_java/pull/90) ([OGKevin](https://github.com/OGKevin))
- Add travis ci bunq/sdk\_java\#80 [\#87](https://github.com/bunq/sdk_java/pull/87) ([OGKevin](https://github.com/OGKevin))
- Optimise test framework \(bunq/sdk\_java\#78\) [\#85](https://github.com/bunq/sdk_java/pull/85) ([OGKevin](https://github.com/OGKevin))
- Updated read me to point to tinker for examples. \(bunq/sdk\_java\#81\) [\#84](https://github.com/bunq/sdk_java/pull/84) ([OGKevin](https://github.com/OGKevin))
- Refresh user context bunq/sdk\_java\#79 [\#83](https://github.com/bunq/sdk_java/pull/83) ([OGKevin](https://github.com/OGKevin))
- Replace examples with tinker bunq/sdk\_java\#66 [\#82](https://github.com/bunq/sdk_java/pull/82) ([OGKevin](https://github.com/OGKevin))

## [0.13.1](https://github.com/bunq/sdk_java/tree/0.13.1) (2018-05-30)
[Full Changelog](https://github.com/bunq/sdk_java/compare/0.13.0...0.13.1)

**Closed issues:**

- Android issue: HttpClient was deprecated in API Level 22 and removed in API Level 23 [\#69](https://github.com/bunq/sdk_java/issues/69)

## [0.13.0](https://github.com/bunq/sdk_java/tree/0.13.0) (2018-03-20)
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

- Fix Jitpack build, add misssing fields, fix field types in generated \[\#6\] [\#8](https://github.com/bunq/sdk_java/pull/8) ([dnl-blkv](https://github.com/dnl-blkv))

## [0.9.1](https://github.com/bunq/sdk_java/tree/0.9.1) (2017-08-08)
**Implemented enhancements:**

- Added tests readme [\#3](https://github.com/bunq/sdk_java/pull/3) ([OGKevin](https://github.com/OGKevin))
- Add first series of unit-tests [\#1](https://github.com/bunq/sdk_java/pull/1) ([OGKevin](https://github.com/OGKevin))



\* *This Change Log was automatically generated by [github_changelog_generator](https://github.com/skywinder/Github-Changelog-Generator)*