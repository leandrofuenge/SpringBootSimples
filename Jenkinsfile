pipeline {
    agent any // Define que o pipeline pode ser executado em qualquer agente disponível

    stages { // Define os estágios do pipeline
        stage('Clonar Repositório') { // Primeiro estágio: Clonar o repositório do Git
            steps {
                git 'https://github.com/seu-usuario/seu-repositorio.git' // Clona o repositório do Git
            }
        }

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

        stage('Publicar Artefatos') { // Quarto estágio: Publicar artefatos
            steps {
                sh 'mvn package' // Comando para empacotar a aplicação usando Maven
                archiveArtifacts 'target/*.jar' // Arquiva os artefatos gerados
            }
        }

        stage('Implantar') { // Quinto estágio: Implantação da aplicação
            steps {
                sh 'ssh usuario@servidor "comando de implantação"' // Exemplo de implantação via SSH
            }
        }
    }

    post { // Define ações a serem executadas após a conclusão do pipeline
        always {
            echo 'Pipeline finalizado' // Mensagem exibida sempre, independentemente do resultado
        }
        success {
            echo 'Pipeline executado com sucesso' // Mensagem exibida se o pipeline for bem-sucedido
        }
        failure {
            echo 'Falha durante a execução do pipeline' // Mensagem exibida se o pipeline falhar
        }
    }
}
