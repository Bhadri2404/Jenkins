def build() {
    echo 'Building the application...'
}

def test() {
    echo 'Running tests...'
}

def deploy(version, envName) {
    echo "Deploying the application version: ${version} to the ${envName} environment."
}

return this
