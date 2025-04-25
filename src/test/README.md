## Introduction
Hi developers!

Welcome to the bunq Java SDK integration tests. Currently we are not
targeting the 100% test coverage, but rather want to be certain that the most
common scenarios can run without any errors.

## Setup
First create a certificate and key using this command

```
openssl req -x509 -newkey rsa:4096 -keyout src/test/Resource/key.pem -out src/test/Resource/certificate.pem -days 365 -nodes -subj "/CN=Your App Id/C=NL" && \
echo -e "\n--- KEY ---\n" && cat src/test/Resource/key.pem && \
echo -e "\n--- CERTIFICATE ---\n" && cat src/test/Resource/certificate.pem
```

## Execution
To run tests via IntelliJ IDEA, you must make sure that you've build the project with gradle.

Afterwards you can right click on the tests folders and should be able to run
the tests cases form the IDE.
