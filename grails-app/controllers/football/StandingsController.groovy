package football

class StandingsController {

    def StandingsService
    def index() { }

    def standingbyTeamLeagugeCountry(){
        println "Parmaters is : "+params
        render StandingsService.serviceMethod(params.country_name,params.league_name,params.team_name)
    }
}
