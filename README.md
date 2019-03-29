# Java Selenium searching auto test

##### There are required software that need to install before the beginning:

* Java Development Kit (version 1.8): https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
* IntelliJ IDEA: https://www.jetbrains.com/idea/download/#section=windows
* Latest version of Google Chrome: https://www.google.com/chrome/
* Selenium WebDriver for Google Chrome: https://sites.google.com/a/chromium.org/chromedriver/

---
##### Configure your IntelliJ IDEA:
* After required software installation you need to add WebDriver 
  into IDE and set the path of the driver for the respective browser;
* Add Selenium and TestNG dependencies into **pom.xml**

#### A project includes following implementation:

* Java Classes for test and pages
* pom.xml for loading of necessary libraries
* .gitignore file contains list of excluded objects for repositary
* chromdriver.exe file of WebDriver

#### Test running:
For test executing need to open SearchTest class and choose "Run SearchTest" (or navigate to SearchTest class and press "Ctrl + Shift + F10").