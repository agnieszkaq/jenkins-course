job('NodeJS example') {
    scm {
        git('git://github.com/wardviaene/docker-demo.git') {  
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell("ping google.pl")
    }
}
