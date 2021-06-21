/**
 * メール通知
 *
 */
// メールをGmailに送信する
def send(result) {
    mail to: "tetsuo.hino@veriserve.co.jp",
        subject: "${env.JOB_NAME} #${env.BUILD_NUMBER} [${result}]",
        body: "Build URL: ${env.BUILD_URL}.\n\n"
}
return this