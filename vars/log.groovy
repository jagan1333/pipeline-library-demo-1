stages
   stage ('message')

def info(message) {
    echo "INFO: ${message}"
}
   stage('warning1')

def warning(message) {
    echo "WARNING: ${message}"
}
