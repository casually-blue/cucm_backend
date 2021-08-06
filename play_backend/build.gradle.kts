plugins {
    id("org.gradle.playframework") version "0.12"
    id("org.gradle.playframework-routes") version "0.12"
    id("org.gradle.playframework-twirl") version "0.12"

    kotlin("jvm") version "1.5.21"
}

dependencies {
    implementation("commons-lang:commons-lang:20030203.000129")
    implementation("com.typesafe.play:play-guice_2.12:2.8.8")
    implementation("io.github.casually-blue:cucm:1.5")
    implementation("com.github.casually-blue:web:1.1")
}

repositories {
    mavenCentral()

    maven {
        name = "Github Packages"
        url = uri("https://maven.pkg.github.com/casually-blue/repos/")
        credentials {
            username = project.findProperty("gpr.user") as String?
            password = project.findProperty("gpr.key") as String?
        }
    }
}

play {
    platform{
        playVersion.set("2.8.8")
        scalaVersion.set("2.12")
        javaVersion.set(JavaVersion.VERSION_1_8)
    }

    injectedRoutesGenerator.set(true)
}

sourceSets {
    named("main") {
        scala.srcDir("app")
    }
}

kotlin {
    sourceSets {
        named("main") {
            kotlin.setSrcDirs(files("$projectDir/app"))
        }
    }
}

tasks.compileKotlin{
    classpath += files("$projectDir/build/classes/java/main")
}

tasks.compileScala {
    val compileKotlin = tasks.compileKotlin.get()
    dependsOn.add(compileKotlin)
    classpath += files(compileKotlin.destinationDirectory)
}