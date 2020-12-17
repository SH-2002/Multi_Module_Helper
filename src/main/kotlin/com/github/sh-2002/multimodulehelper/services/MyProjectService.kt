package com.github.sh-2002.multimodulehelper.services

import com.intellij.openapi.project.Project
import com.github.sh-2002.multimodulehelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
