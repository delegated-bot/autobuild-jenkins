package org.util

class Util implements Serializable {

    def steps

    Run(steps) {
        this.steps = steps
    }

    void run(String message = null) {
        steps.echo(message ?: "Shared library works!")
    }
}
