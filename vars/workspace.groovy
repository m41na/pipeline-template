import works.hop.vshared.GradleProject

var project = new GradleProject();

def call(){
    sh "echo Initializing ${env.JOB_NAME} project"
    sh "echo importing bean class"

    workspaceDir="/var/jenkins_home/workspace/$env.WORKSPACE"
    orgName="m41na"
    repoName="vshared"
    credentialsId:"m41na"

    sh "echo initializing workspace directory $workspaceDir"
    project.init(workspaceDir)

    sh "echo cloning repository into workspace $workspaceDir"
    project.cloneRepo(orgName: orgName, repoName: repoName, credentialsId:credentialsId)

    sh "echo Building ${env.JOB_NAME} project"
    project.build(folder)
}