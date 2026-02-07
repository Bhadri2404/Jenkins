def build() {
    echo 'Building the application...'
}

def test() {
    echo 'Running tests...'
}

def deploy(version) {
    input{
        message: "select the env to deploy",
        ok: "Done"
        parameters{
            choice(name: 'ENV', choices: ['dev', 'staging', 'prod'], description: 'Select the environment to deploy to')
        }
        
    }
    echo "Deploying the application version: ${version} to ${params.ENV} environment..."
}