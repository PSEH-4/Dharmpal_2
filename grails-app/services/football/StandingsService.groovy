package football

import grails.transaction.Transactional

@Transactional
class StandingsService {

    def grailsApplication
    def rest
    def serviceMethod(def country_name,def league_name,def team_name) {

        def url = grailsApplication.config.getProperty('api.url')
        def apiKey = grailsApplication.config.getProperty('api.APIkey')
        def actionName = "get_standings"
        def league_id
        def country_id
        /*
        get legue based on country name and league name
         */

        def getLeaguesURL = "${url}/?action=get_leagues&APIkey=${apiKey}"
        def leagueresponseData = rest.get(getLeaguesURL)
        leagueresponseData.json.each{
            println it
            if (it.country_name == country_name && it.league_name == league_name){
                country_id = it.country_id
                league_id = it.league_id
                return true
            }
        }
        println "League  league_id: ${country_id} : league_id: ${league_id}"
        if (country_id == null || league_id == null) return []

        def urlString = "${url}/?action=${actionName}&league_id=${league_id}&APIkey=${apiKey}"
        println urlString
        def responseData = rest.get(urlString)

        def result = []
        responseData.json.each{
            println it
            if (it.team_name == team_name )result.add(it)
        }
        return result

    }
}
