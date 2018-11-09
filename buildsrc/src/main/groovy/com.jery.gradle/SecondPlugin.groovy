package com.jery.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class SecondPlugin implements Plugin<Project> {

    void apply(Project project) {
        System.out.println("========================")
        System.out.println("这是第二个插件!")
        System.out.println("========================")
    }
}
