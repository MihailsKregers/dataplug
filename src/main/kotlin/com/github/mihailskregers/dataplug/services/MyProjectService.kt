package com.github.mihailskregers.dataplug.services

import com.intellij.openapi.project.Project
import com.github.mihailskregers.dataplug.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
