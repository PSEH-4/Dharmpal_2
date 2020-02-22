package football

class UrlMappings {

    static mappings = {
        /*"/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }*/
        get "/standings"(controller:"Standings",action:"standingbyTeamLeagugeCountry")
       get "/teams"(controller:"team",action:"getAll")
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
