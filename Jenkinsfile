pipeline {
    agent any // Define que o pipeline pode ser executado em qualquer agente disponível

    stages {

        stage('Compilar') { // Segundo estágio: Compilar o código
            steps {
                sh 'mvn clean compile' // Comando para compilar o código usando Maven
            }
        }

        stage('Testar') { // Terceiro estágio: Executar testes
            steps {
                sh 'mvn test' // Comando para executar os testes usando Maven
            }
        }



