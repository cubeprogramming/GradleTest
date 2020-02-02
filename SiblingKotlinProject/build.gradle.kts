apply(from = "/Users/cube/OneDrive - Sysco AS/source/GradleTest/SimpleScriptPlugin/build.gradle.kts")


plugins{
  java
}

dependencies{
//  implementation(project(":SampleKotlinProject"))
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.6")
  implementation("org.postgresql:postgresql")
}
