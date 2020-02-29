package football

import grails.transaction.Transactional

@Transactional
class CompetitionsService {

    def grailsApplication
    def rest
    def getAll() {
        def url = grailsApplication.config.getProperty('api.url')
        def apiKey = grailsApplication.config.getProperty('api.APIkey')
        def actionName = "get_countries"
        def urlString = "${url}/?action=${actionName}&APIkey=${apiKey}"
        println urlString
        def responseData = rest.get("${url}/?action=${actionName}&APIkey=${apiKey}")
        return responseData.json

    }
}
