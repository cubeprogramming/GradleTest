class GreetingPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    project.allprojects{
      /*buildscript{
        dependencies{
          classpath("org.postgresql:postgresql:42.2.2")
        }
      }*/

      task("hello") {
        doLast {
          println("Hello from the GreetingPlugin")
        }
      }
    }
  }
}

buildscript{
  repositories {
    mavenCentral()
  }

  dependencies{
    classpath("org.postgresql:postgresql:42.2.2")
  }
}

// Apply the plugin
apply<GreetingPlugin>()


