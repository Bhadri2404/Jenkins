def build() {
    echo 'Building the application...'
}

def test() {
    echo 'Running tests...'
}

def deploy(version) {

    echo "Deploying the application version: ${version} to the ${params.ENV} environment."
    
}   