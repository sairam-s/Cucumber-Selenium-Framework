# Cucumber-Selenium-Framework
### Setting up your environment:
 - You would need Eclipse IDE installed.
 - Maven installed on your machine and the M2_HOME and M2 path variables setup.
 - Java 1.8 jdk with JAVA_HOME and path variable setup for java.
   ```
    Point Java >>> Installed JRE to the java 1.8 jdk
    Set the Default VM Arguments to "-Dmaven.multiModuleProjectDirectory=M2_HOME"
   ```
 - Install Maven in Eclipse IDE.
    ```
    1. Open Eclipse
    2. Go to Help -> Eclipse Marketplace
    3. Search by Maven
    4. Click "Install" button at "Maven Integration for Eclipse" section
    5. Follow the instruction step by step

    After successful installation do the followings in Eclipse:
    1. Go to Window --> Preferences
    2. Observe, Maven is enlisted at left panel
    ```
 - Install TestNg in Eclipse IDE.
    ```
    1. Select Help / Install New Software...
    2. Enter the update site URL in "Work with:" field:
        Update site for release: http://beust.com/eclipse.
        Or, Update site for beta: http://beust.org/eclipse-beta , use it if you want to experiment with the new features or verify the bug fixes, and please report back if you encounter any issues.
    3. Make sure the check box next to URL is checked and click Next.
    4. Eclipse will then guide you through the process.
    ```
    OR 
    Install TestNg from Eclipse Marketplace.
 - Install the following software from Eclipse Marketplace.
    ```
     1. Natural
     2. Eclipse Colour Theme
     3. Cucumber Eclipse PlugIn
    ```
### Importing the project:
  - Clone the repository [Cucumber-Selenium-Framework](https://github.com/sairam-s/Cucumber-Selenium-Framework.git).
  - Open Eclipse IDE.
  - File >> Import >> Maven >> Existing Maven Project.
  - Navigate to *Cucumber-Selenium-Framework\CucumberFramework* in the downloaded/clone repo.
  - Click finish.
### Downloading the project dependencies:
  - Update project dependencies from Eclipse IDE.
  ```
    - Right click on the project in Eclipse IDE.
    - Run as >> Maven Clean.
    - Right click on the project.
    - Maven >> Update Project.
    - Check Force Update of Snapshots/Releases/.
  ```
  ### Running the tests:
   - Use the runner class MainRunner.java to run test.
   > You may need to adject the path for the gecko driver in LoginStepDefinition.java under StepDefinitions package.
   > You have to provide your stockoverflow user-name and password in the LoginStepDefinition.java for the tests to pass.
   
       

    
