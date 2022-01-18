data class Match(val teamA:String , val goalsA : Int, val teamB:String , val goalsB : Int)
fun Match.show(){ println("$teamA $goalsA -  $teamB $goalsB") }

fun Match.getGoals():Int = goalsA + goalsB

fun Match.containsTeam(team : String ): Boolean = team == teamA || team == teamB

fun allGoals(ms : List<Match>): Int = ms.fold(0){ acc:Int, curr:Match -> acc + curr.getGoals()  }

fun getMatchsFromTeam(ms : List<Match>, team : String ):List<Match> =
    ms.filter{m : Match-> m.containsTeam(team)}

fun printTeamMatchs(ts : List<Match>,  team : String) {
    val teamMs = getMatchsFromTeam(ts, team)
    teamMs.forEach{m -> m.show()}
    println("Total de golos = ${allGoals(teamMs)}" )
}

fun main(){
    val championship = listOf(Match("Equipa1", 2, "Equipa2", 3),
        Match("Equipa3", 1, "Equipa4", 1),
        Match("Equipa1", 0, "Equipa3", 1),
        Match("Equipa4", 2, "Equipa1", 1))

    printTeamMatchs(championship, "Equipa3")
}
