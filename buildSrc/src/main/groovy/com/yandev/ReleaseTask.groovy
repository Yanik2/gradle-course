package com.yandev

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction

class ReleaseTask extends DefaultTask {
    @Input
    Boolean input
    @OutputFile
    File releaseFile

    @TaskAction
    void performRelease() {
        println("asdfasdfasdfasdfasdfasdfasdfasdf")
    }
}
