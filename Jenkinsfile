pipeline {
    agent any // Define que o pipeline pode ser executado em qualquer agente disponível

    stages {
        stage('Compilar') { // Segundo estágio: Compilar o código
            steps {
                script {
                    // Comando para compilar o código usando Maven
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Testar') { // Terceiro estágio: Executar testes
            steps {
                script {
                    // Comando para executar os testes usando Maven
                    sh 'mvn test'
                }
            }
        }
    }
}
