def call() {
    try {
        // Run docker-compose to start containers in detached mode
        sh 'docker-compose up -d'
    } // catch (Exception e) {
        // Catch the error, print the message, and mark the build as failed
        // echo "Docker Compose failed: ${e.getMessage()}"
        // currentBuild.result = 'FAILURE' // Mark the build as failure
        // throw e // Re-throw the error to fail the build
    // }
// }
