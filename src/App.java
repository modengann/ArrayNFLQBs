/*
 * ============================================================
 *  QB Stats: 2025 NFL Season
 * ============================================================
 *
 *  Each quarterback's stats are stored in ONE String, with the
 *  values separated by commas. This is called CSV format
 *  (comma-separated values). The order is always:
 *
 *    name, team, passing yards, touchdowns, interceptions, passer rating, completion %
 *
 *  Example:
 *    "Josh Allen,Buffalo Bills,3668,25,10,102.2,69.3"
 *
 *  Your job is to finish the methods below. Each one takes in
 *  a line like the one above. Use split(",") to break the line
 *  into pieces, then use those pieces.
 *
 *  Remember: split gives you back an array of Strings. If you
 *  want to do math with a piece, you have to turn it into a
 *  number first (Integer.valueOf or Double.valueOf).
 *
 *  main is already written for you. Each method is called on
 *  ONE quarterback (Josh Allen) to start. Get it working for
 *  one, then uncomment the loops below it to run it on the five
 *  QBs at the top of main, and then on allQBs, which holds all
 *  44 QBs who threw 100+ passes in 2025.
 *  Work on one method at a time, top to bottom.
 *
 * ------------------------------------------------------------
 *  1. printSummary(String line)
 * ------------------------------------------------------------
 *  Unpack the line and print a sentence about the QB's season.
 *  You choose the wording, but use every stat. Something like:
 *
 *    Josh Allen of the Buffalo Bills threw for 3668 yards with
 *    25 touchdowns and 10 interceptions. He completed 69.3% of
 *    his passes and had a passer rating of 102.2.
 *
 * ------------------------------------------------------------
 *  2. tdToIntRatio(String line)
 * ------------------------------------------------------------
 *  How many touchdowns did the QB throw for every interception?
 *  Divide touchdowns by interceptions and print the result.
 *
 *    Josh Allen threw 2.5 touchdowns for every interception.
 *
 *  Careful: if your answer for Josh Allen comes out as 2 and
 *  not 2.5, think about what happens when you divide one int
 *  by another int.
 *
 * ------------------------------------------------------------
 *  3. fantasyPoints(String line)
 * ------------------------------------------------------------
 *  Calculate the QB's fantasy football points for the season
 *  using standard scoring:
 *
 *    +0.04 points for every passing yard
 *    +4 points for every touchdown
 *    -2 points for every interception
 *
 *    Josh Allen scored 226.72 fantasy points.
 *
 * ------------------------------------------------------------
 *  4. teamNickname(String line)
 * ------------------------------------------------------------
 *  Print just the team's nickname: the last word of the team
 *  name.
 *
 *    Josh Allen plays for the Bills.
 *
 *  Watch out: some team names are three words long
 *  ("Los Angeles Rams", "New England Patriots"). Your code
 *  should work for any team name, no matter how many words.
 *
 * ------------------------------------------------------------
 *  5. compare(String line1, String line2)
 * ------------------------------------------------------------
 *  This one takes in TWO quarterbacks. Print which one threw for
 *  more yards, and by how much.
 *
 *    Matthew Stafford threw for 1039 more yards than Josh Allen.
 *
 *  It should work no matter which QB is passed in first.
 *
 * ------------------------------------------------------------
 *  Check your work
 * ------------------------------------------------------------
 *    QB                 TD:INT    Fantasy   Nickname
 *    Josh Allen         2.5       226.72    Bills
 *    Drake Maye         3.875     283.76    Patriots
 *    Matthew Stafford   5.75      356.28    Rams
 *    Caleb Williams     3.857...  251.68    Bears
 *    Geno Smith         1.117...  163.0     Raiders
 *
 *  Don't worry if your decimals print long (3.857142857142857).
 *  That's fine for this one.
 * ============================================================
 */

public class App {

    public static void main(String[] args) {
        String allen = "Josh Allen,Buffalo Bills,3668,25,10,102.2,69.3";
        String maye = "Drake Maye,New England Patriots,4394,31,8,113.5,72.0";
        String stafford = "Matthew Stafford,Los Angeles Rams,4707,46,8,109.2,65.0";
        String williams = "Caleb Williams,Chicago Bears,3942,27,7,90.1,58.1";
        String smith = "Geno Smith,Las Vegas Raiders,3025,19,17,84.7,67.4";

        String[] qbs = {allen, maye, stafford, williams, smith};

        // Every QB with 100+ pass attempts in 2025 (44 of them).
        // The data is in the getAllQBs method at the bottom of this file.
        String[] allQBs = getAllQBs();

        // ---------- 1. Summaries ----------
        System.out.println("=== Summaries ===");

        // Start with one QB. Swap in a different name to try others.
        printSummary(allen);

        // Once that works, try the five QBs above.
        // for (String qb : qbs) {
        //     printSummary(qb);
        // }

        // Then try every QB in the league.
        // for (String qb : allQBs) {
        //     printSummary(qb);
        // }

        // ---------- 2. TD to INT Ratio ----------
        System.out.println();
        System.out.println("=== TD to INT Ratio ===");

        tdToIntRatio(allen);

        // for (String qb : qbs) {
        //     tdToIntRatio(qb);
        // }

        // for (String qb : allQBs) {
        //     tdToIntRatio(qb);
        // }

        // ---------- 3. Fantasy Points ----------
        System.out.println();
        System.out.println("=== Fantasy Points ===");

        fantasyPoints(allen);

        // for (String qb : qbs) {
        //     fantasyPoints(qb);
        // }

        // for (String qb : allQBs) {
        //     fantasyPoints(qb);
        // }

        // ---------- 4. Team Nicknames ----------
        System.out.println();
        System.out.println("=== Team Nicknames ===");

        teamNickname(allen);

        // for (String qb : qbs) {
        //     teamNickname(qb);
        // }

        // for (String qb : allQBs) {
        //     teamNickname(qb);
        // }

        // ---------- 5. Comparisons ----------
        System.out.println();
        System.out.println("=== Comparisons ===");

        compare(stafford, allen);

        // compare(allen, maye);
        // compare(williams, smith);

        // Compare every QB in the league to Josh Allen.
        // What happens when Josh Allen gets compared to himself?
        // for (String qb : allQBs) {
        //     compare(qb, allen);
        // }
    }

    public static void printSummary(String line) {
        // Your code here
    }

    public static void tdToIntRatio(String line) {
        // Your code here
    }

    public static void fantasyPoints(String line) {
        // Your code here
    }

    public static void teamNickname(String line) {
        // Your code here
    }

    public static void compare(String line1, String line2) {
        // Your code here
    }

    // ============================================================
    //  You don't need to change anything below this line.
    //  2025 regular season, QBs with 100+ pass attempts,
    //  sorted by passer rating (highest first).
    //  name, team, yards, TDs, INTs, rating, completion %
    // ============================================================
    public static String[] getAllQBs() {
        String[] allQBs = {
            "Drake Maye,New England Patriots,4394,31,8,113.5,72.0",
            "Matthew Stafford,Los Angeles Rams,4707,46,8,109.2,65.0",
            "Jared Goff,Detroit Lions,4564,34,8,105.5,68.0",
            "Lamar Jackson,Baltimore Ravens,2549,21,7,103.8,63.6",
            "Josh Allen,Buffalo Bills,3668,25,10,102.2,69.3",
            "Jordan Love,Green Bay Packers,3381,23,6,101.2,66.3",
            "Joe Burrow,Cincinnati Bengals,1809,17,5,100.7,66.8",
            "Brock Purdy,San Francisco 49ers,2167,20,10,100.5,69.4",
            "Daniel Jones,Indianapolis Colts,3101,19,8,100.2,68.0",
            "Dak Prescott,Dallas Cowboys,4552,30,10,99.5,67.3",
            "Sam Darnold,Seattle Seahawks,4048,25,14,99.1,67.7",
            "Jalen Hurts,Philadelphia Eagles,3224,25,6,98.5,64.8",
            "Mac Jones,San Francisco 49ers,2151,13,6,97.4,69.6",
            "Aaron Rodgers,Pittsburgh Steelers,3322,24,7,94.8,65.7",
            "Justin Herbert,Los Angeles Chargers,3727,26,13,94.1,66.4",
            "Jacoby Brissett,Arizona Cardinals,3366,23,8,94.1,64.9",
            "C.J. Stroud,Houston Texans,3041,19,8,92.9,64.5",
            "Jaxson Dart,New York Giants,2272,15,5,91.7,63.7",
            "Tyler Shough,New Orleans Saints,2384,10,6,91.3,67.6",
            "Trevor Lawrence,Jacksonville Jaguars,4007,29,12,91.0,60.9",
            "Baker Mayfield,Tampa Bay Buccaneers,3693,26,11,90.6,63.2",
            "Caleb Williams,Chicago Bears,3942,27,7,90.1,58.1",
            "Patrick Mahomes,Kansas City Chiefs,3587,22,11,89.6,62.7",
            "Justin Fields,New York Jets,1259,7,1,89.5,62.7",
            "Kyler Murray,Arizona Cardinals,962,6,3,88.6,68.3",
            "Michael Penix,Atlanta Falcons,1982,9,3,88.5,60.1",
            "Tua Tagovailoa,Miami Dolphins,2660,20,15,88.5,67.7",
            "Jayden Daniels,Washington Commanders,1262,8,3,88.1,60.6",
            "Bo Nix,Denver Broncos,3931,25,11,87.8,63.4",
            "Bryce Young,Carolina Panthers,3011,23,11,87.8,63.6",
            "Spencer Rattler,New Orleans Saints,1586,8,5,86.5,67.6",
            "Marcus Mariota,Washington Commanders,1695,10,7,86.1,61.2",
            "Carson Wentz,Minnesota Vikings,1216,6,5,85.8,65.1",
            "Kirk Cousins,Atlanta Falcons,1721,10,5,84.8,61.7",
            "Geno Smith,Las Vegas Raiders,3025,19,17,84.7,67.4",
            "Davis Mills,Houston Texans,915,5,1,81.6,57.2",
            "Dillon Gabriel,Cleveland Browns,937,7,2,80.8,59.5",
            "Cam Ward,Tennessee Titans,3169,15,7,80.2,59.8",
            "Russell Wilson,New York Giants,831,3,3,77.4,58.0",
            "Tyrod Taylor,New York Jets,779,5,5,72.9,59.7",
            "J.J. McCarthy,Minnesota Vikings,1632,11,12,72.6,57.6",
            "Jake Browning,Cincinnati Bengals,771,6,8,71.1,64.8",
            "Shedeur Sanders,Cleveland Browns,1400,7,10,68.1,56.6",
            "Brady Cook,New York Jets,739,2,7,55.4,57.5"
        };
        return allQBs;
    }
}