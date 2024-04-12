package burdsall.wordlefx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class WordleController {


    String[] words = {
        "aahed", "aalii", "abaca", "abaci", "aback", "abaft", "abamp",
        "abase", "abash", "abate", "abbas", "abbey", "abbot", "abeam",
        "abets", "abhor", "abide", "abled", "abler", "abmho", "abode",
        "abohm", "aboil", "aboon", "abort", "about", "above", "abuse",
        "abuts", "abuzz", "abyes", "abysm", "abyss", "acari", "acerb",
        "ached", "aches", "achoo", "acids", "acmes", "acned", "acnes",
        "acold", "acorn", "acred", "acres", "acrid", "acted", "actin",
        "actor", "acute", "adage", "adapt", "addax", "added", "adder",
        "addle", "adeem", "adept", "adieu", "adios", "adits", "adman",
        "admen", "admin", "admit", "admix", "adobe", "adopt", "adore",
        "adorn", "adown", "adoze", "aduki", "adult", "adzed", "adzes",
        "aegis", "aeons", "aerie", "aeros", "afear", "affix", "afire",
        "afoot", "afore", "afoul", "afrit", "afros", "after", "again",
        "agape", "agars", "agate", "agave", "agent", "agers", "agger",
        "agile", "aging", "agios", "agism", "aglet", "aglow", "agone",
        "agons", "agony", "agora", "agree", "agros", "agued", "agues",
        "aguti", "ahead", "ahold", "aided", "aider", "aides", "aidos",
        "aiery", "aight", "ailed", "aimed", "aioli", "aired", "airts",
        "aisle", "aitch", "ajuga", "akela", "alack", "alamo", "aland",
        "alarm", "albas", "album", "alder", "alefs", "aleph", "alert",
        "alfas", "algae", "algal", "algas", "algid", "alias", "alibi",
        "alien", "alifs", "align", "alike", "alive", "alkyd", "alkyl",
        "allay", "alley", "allot", "allow", "alloy", "allyl", "aloes",
        "aloft", "aloha", "aloin", "alone", "along", "aloof", "aloud",
        "alpha", "altar", "alter", "altos", "alums", "amahs", "amass",
        "amaze", "amber", "ambit", "amble", "ameba", "ameer", "amend",
        "amens", "amide", "amido", "amigo", "amine", "amino", "amirs",
        "amiss", "amity", "ammos", "among", "amort", "amped", "ample",
        "amply", "amuck", "amuse", "amyls", "anent", "angel", "anger",
        "angle", "angry", "angst", "anile", "anima", "anime", "anion",
        "anise", "ankhs", "ankle", "annas", "annex", "annoy", "annul",
        "anode", "antes", "antic", "antis", "anvil", "aorta", "apace",
        "apart", "apers", "aphid", "aping", "apnea", "appel", "apple",
        "apply", "apron", "apses", "apsis", "aptly", "aquae", "aquas",
        "arbor", "arced", "ardor", "areae", "areal", "areas", "arena",
        "argon", "argot", "argue", "argus", "arhat", "arias", "arils",
        "arise", "armed", "armer", "armor", "aroma", "arose", "arras",
        "array", "arrow", "arses", "arson", "artsy", "ascot", "ashen",
        "ashes", "aside", "asked", "asker", "askew", "aspen", "aspic",
        "assai", "assay", "asses", "asset", "aster", "astir", "ataxy",
        "atilt", "atlas", "atmos", "atoll", "atoms", "atomy", "atone",
        "attar", "attic", "audio", "audit", "auger", "aught", "augur",
        "aunts", "aunty", "aurae", "aural", "auras", "auric", "autos",
        "auxin", "avail", "avast", "avens", "avers", "avert", "avian",
        "aviso", "avoid", "avows", "await", "awake", "award", "aware",
        "awash", "aways", "awful", "awing", "awned", "awoke", "axels",
        "axial", "axils", "axing", "axiom", "axion", "axite", "axled",
        "axles", "axman", "axmen", "axons", "ayahs", "ayins", "azans",
        "azide", "azido", "azine", "azoic", "azons", "azote", "azoth",
        "azuki", "azure", "baaed", "baals", "babas", "babel", "babes",
        "backs", "bacon", "baddy", "badge", "badly", "baffs", "bagel",
        "baggy", "bahts", "bails", "bairn", "baits", "baize", "baked",
        "baker", "bakes", "baldy", "baled", "baler", "bales", "balks",
        "balky", "balls", "bally", "balms", "balmy", "balsa", "banal",
        "bands", "bandy", "banes", "bangs", "banjo", "banks", "banns",
        "barbs", "bards", "bared", "barer", "bares", "barfs", "barge",
        "barks", "barmy", "barns", "baron", "barre", "basal", "based",
        "baser", "bases", "basic", "basil", "basin", "basis", "basks",
        "basso", "baste", "basts", "batch", "bated", "bates", "bathe",
        "baths", "batik", "baton", "batty", "bauds", "baulk", "bawds",
        "bawdy", "bawls", "bayed", "bayou", "bazar", "beach", "beads",
        "beady", "beaks", "beaky", "beams", "beans", "beany", "beard",
        "bears", "beast", "beats", "beaus", "beaut", "beaux", "bebop",
        "becks", "bedew", "bedim", "beech", "beefs", "beefy", "beeps",
        "beers", "beery", "beets", "befit", "befog", "began", "begat",
        "beget", "begin", "begot", "begum", "begun", "beige", "being",
        "belay", "belch", "belie", "belle", "bells", "belly", "below",
        "belts", "bemix", "bench", "bends", "bendy", "bento", "bents",
        "beret", "bergs", "berms", "berry", "berth", "beryl", "beset",
        "besom", "besot", "bests", "betas", "betel", "betes", "beths",
        "bevel", "bewig", "bezel", "bezes", "bhaji", "biali", "bialy",
        "bible", "bicep", "biddy", "bided", "bider", "bides", "bidet",
        "biers", "bight", "bigot", "bijou", "biked", "biker", "bikes",
        "bilbo", "biles", "bilge", "bilks", "bills", "billy", "bimas",
        "bimbo", "bindi", "binds", "binge", "bingo", "bints", "biome",
        "biota", "biped", "birch", "birds", "birls", "biros", "birth",
        "bises", "bisks", "bison", "bitch", "biter", "bites", "bitsy",
        "bitts", "bitty", "bizes", "blabs", "black", "blade", "blahs",
        "blame", "blams", "bland", "blank", "blare", "blase", "blast",
        "blate", "blaze", "bleak", "blear", "bleat", "bleed", "bleep",
        "blend", "blent", "bless", "blest", "blimp", "blind", "bling",
        "blini", "blink", "bliny", "blips", "bliss", "blitz", "bloat",
        "blobs", "block", "blocs", "blogs", "bloke", "blond", "blood",
        "bloom", "blots", "blown", "blows", "blowy", "bluer", "blues",
        "bluet", "bluey", "bluff", "blunt", "blurb", "blurs", "blurt",
        "blush", "board", "boars", "boast", "boats", "bobby", "bocce",
        "bocci", "boded", "bodes", "boffo", "boffs", "bogey", "boggy",
        "bogie", "bogus", "boils", "boing", "bolas", "boles", "bolls",
        "bolos", "bolts", "bolus", "bombe", "bombs", "bonds", "boned",
        "boner", "bones", "boney", "bongo", "bongs", "bonks", "bonny",
        "bonus", "bonze", "boobs", "booby", "booed", "boogy", "boohs",
        "books", "booms", "boomy", "boons", "boors", "boost", "booth",
        "boots", "booty", "booze", "boozy", "borax", "bored", "borer",
        "bores", "boric", "borne", "boron", "bosom", "boson", "bossy",
        "botch", "bough", "boule", "bound", "bourn", "bouts", "bovid",
        "bowed", "bowel", "bower", "bowls", "boxed", "boxer", "boxes",
        "boyar", "boyos", "bozos", "brace", "bract", "brads", "braes",
        "brags", "braid", "brail", "brain", "brake", "brand", "brane",
        "brans", "brant", "brash", "brass", "brats", "brava", "brave",
        "bravo", "brawl", "brawn", "braws", "brays", "braze", "bread",
        "break", "bream", "breed", "breve", "brews", "breys", "briar",
        "bribe", "brick", "bride", "brief", "brier", "bries", "brigs",
        "brill", "brims", "brine", "bring", "brink", "briny", "brios",
        "brisk", "broad", "broil", "broke", "brood", "brook", "broom",
        "broth", "brown", "brows", "bruin", "bruit", "brume", "brunt",
        "brush", "brute", "bucks", "buddy", "budge", "buffs", "buggy",
        "bugle", "build", "built", "bulbs", "bulge", "bulgy", "bulks",
        "bulky", "bulla", "bulls", "bully", "bumps", "bumpy", "bunch",
        "bunco", "bundt", "bungs", "bunko", "bunks", "bunns", "bunny",
        "bunts", "buoys", "burbs", "buret", "burgs", "burin", "burls",
        "burly", "burns", "burnt", "burps", "burqa", "burro", "burrs",
        "burse", "burst", "bused", "buses", "bushy", "busks", "busts",
        "busty", "butch", "buteo", "butte", "butts", "butty", "butyl",
        "buxom", "buyer", "buzzy", "bwana", "bylaw", "byres", "bytes",
        "byway", "cabal", "cabby", "caber", "cabin", "cable", "cacao",
        "cache", "cacks", "cacti", "caddy", "cadet", "cadge", "cadgy",
        "cadre", "cafes", "caged", "cager", "cages", "cagey", "caids",
        "cairn", "caked", "cakes", "cakey", "calfs", "calif", "calix",
        "calks", "calla", "calls", "calms", "calve", "calyx", "camel",
        "cameo", "camps", "campy", "canal", "candy", "caned", "caner",
        "canes", "canid", "canna", "canny", "canoe", "canon", "canst",
        "canto", "cants", "canty", "caped", "caper", "capes", "capos",
        "caput", "carat", "carbs", "cards", "cared", "carer", "cares",
        "caret", "cargo", "carob", "carol", "carom", "carps", "carry",
        "carts", "carve", "cased", "cases", "casks", "caste", "casts",
        "catch", "cater", "catty", "caulk", "cauls", "cause", "caved",
        "caver", "caves", "cavil", "cawed", "cease", "cedar", "ceded",
        "cedes", "celli", "cello", "cells", "cents", "ceres", "certs",
        "chads", "chafe", "chaff", "chain", "chair", "chais", "chalk",
        "champ", "chant", "chaos", "chaps", "chard", "charm", "chars",
        "chart", "chary", "chase", "chasm", "chats", "chaws", "cheap",
        "cheat", "check", "cheek", "cheep", "cheer", "chefs", "chela",
        "chert", "chess", "chest", "chevy", "chews", "chewy", "chick",
        "chide", "chief", "child", "chili", "chill", "chime", "chimp",
        "china", "chine", "chink", "chino", "chins", "chips", "chirp",
        "chits", "chive", "chivy", "chock", "choir", "choke", "chomp",
        "chops", "chord", "chore", "chose", "chows", "chubs", "chuck",
        "chuff", "chugs", "chump", "chums", "chunk", "churl", "churn",
        "chute", "chyle", "chyme", "cider", "cigar", "cilia", "cinch",
        "circa", "cisco", "cited", "citer", "cites", "civet", "civic",
        "civil", "clack", "claim", "clamp", "clams", "clang", "clank",
        "clans", "claps", "clash", "clasp", "class", "clast", "clave",
        "claws", "clays", "clean", "clear", "cleat", "cleek", "clefs",
        "cleft", "clerk", "click", "cliff", "climb", "clime", "cling",
        "clink", "clips", "cloak", "clock", "clods", "clogs", "clomp",
        "clone", "clops", "close", "cloth", "clots", "cloud", "clout",
        "clove", "clown", "cloys", "cloze", "clubs", "cluck", "clued",
        "clues", "clump", "clung", "clunk", "coach", "coals", "coaly",
        "coast", "coati", "coats", "cobra", "cocas", "cocks", "cocky",
        "cocoa", "codas", "coded", "coder", "codes", "codex", "codon",
        "coeds", "coffs", "coifs", "coign", "coils", "coins", "coked",
        "cokes", "colas", "colds", "coles", "colic", "colon", "color",
        "colts", "colza", "comas", "combe", "combo", "combs", "comer",
        "comes", "comet", "comfy", "comic", "comma", "comms", "compo",
        "comps", "conch", "condo", "coned", "cones", "coney", "conga",
        "conge", "conic", "conks", "conky", "cooed", "cooee", "cooer",
        "cooey", "cooks", "cooky", "cools", "coomb", "coons", "coops",
        "coopt", "coots", "copal", "coped", "coper", "copes", "copra",
        "copse", "coral", "cords", "cored", "corer", "cores", "corgi",
        "corks", "corns", "corny", "corps", "corse", "coset", "costa",
        "costs", "cotes", "couch", "cough", "could", "count", "coupe",
        "coups", "court", "couth", "coved", "coven", "cover", "coves",
        "covet", "covey", "cowed", "cower", "cowls", "cowry", "coxae",
        "coxed", "coxes", "coyer", "coyly", "cozen", "cozes", "crabs",
        "crack", "craft", "crags", "cramp", "crams", "crane", "crank",
        "crape", "craps", "crash", "crass", "crate", "crave", "crawl",
        "craws", "craze", "crazy", "creak", "cream", "credo", "creed",
        "creek", "creel", "creep", "creme", "crepe", "crept", "cress",
        "crest", "crews", "cribs", "crick", "cried", "crier", "cries",
        "crime", "crimp", "cripe", "crisp", "croak", "croci", "crock",
        "crocs", "croft", "crone", "crony", "crook", "croon", "crops",
        "crore", "cross", "croup", "crowd", "crown", "crows", "crude",
        "cruds", "cruel", "cruet", "crumb", "crump", "crush", "crust",
        "crwth", "cryer", "crypt", "cubby", "cubed", "cubes", "cubic",
        "cubit", "cuffs", "cuifs", "cuing", "cukes", "culls", "cults",
        "cumin", "cupid", "cuppa", "curbs", "curds", "cured", "curer",
        "cures", "curfs", "curia", "curie", "curio", "curls", "curly",
        "curry", "curse", "curve", "curvy", "cushy", "cusps", "cuter",
        "cutey", "cutie", "cutis", "cyans", "cyber", "cycle", "cymes",
        "cynic", "cysts", "czars", "dacha", "daddy", "dados", "daffy",
        "daily", "dairy", "daisy", "dales", "dally", "daman", "dames",
        "damns", "damps", "dance", "dandy", "dangs", "dared", "dares",
        "darks", "darts", "dated", "dater", "dates", "datum", "daubs",
        "daunt", "davit", "dawns", "dazed", "dazes", "deads", "deals",
        "dealt", "deans", "dears", "deary", "death", "debar", "debit",
        "debts", "debug", "debut", "decaf", "decal", "decay", "decks",
        "decor", "decoy", "decry", "deeds", "deems", "deeps", "deers",
        "deets", "defer", "defog", "deice", "deify", "deign", "deism",
        "deist", "deity", "dekes", "dekko", "delay", "deles", "delft",
        "dells", "delta", "delve", "demit", "demon", "demos", "demur",
        "denim", "dense", "dents", "depot", "depth", "derby", "desks",
        "deter", "detox", "deuce", "devil", "dewar", "dexes", "dhoti",
        "dhows", "dials", "diary", "diazo", "diced", "dicer", "dices",
        "dicey", "dicks", "dicky", "dicot", "dicta", "didst", "diene",
        "diets", "diffs", "digit", "dikes", "dildo", "dilly", "dimer",
        "dimes", "dimly", "dined", "diner", "dines", "dingo", "dings",
        "dingy", "dinks", "dinky", "dinos", "dints", "diode", "dippy",
        "direr", "dirge", "dirks", "dirts", "dirty", "disco", "discs",
        "dishy", "disks", "ditch", "ditto", "ditty", "ditzy", "divan",
        "divas", "dived", "diver", "dives", "divot", "divvy", "dizzy",
        "djinn", "djins", "docks", "dodge", "dodgy", "dodos", "doers",
        "doest", "doeth", "doffs", "dogey", "doggy", "dogma", "doily",
        "doing", "dojos", "doled", "doles", "dolls", "dolly", "dolor",
        "dolts", "donee", "donga", "donor", "donut", "dooms", "doors",
        "doozy", "doped", "dopes", "dopey", "dorks", "dorky", "dorms",
        "dosas", "dosed", "doses", "doted", "doter", "dotes", "dotty",
        "doubt", "douce", "dough", "doula", "douse", "doves", "dowdy",
        "dowel", "dower", "downs", "downy", "dowry", "dowse", "doxed",
        "doxes", "doxie", "doyen", "dozed", "dozen", "dozer", "dozes",
        "drabs", "draft", "drags", "drain", "drake", "drama", "drams",
        "drank", "drape", "drats", "drawl", "drawn", "draws", "drays",
        "dread", "dream", "dreck", "dregs", "dress", "dribs", "dried",
        "drier", "dries", "drift", "drill", "drily", "drink", "drips",
        "drive", "droid", "droit", "droll", "drone", "drool", "droop",
        "drops", "dross", "drove", "drown", "drubs", "drugs", "druid",
        "drums", "drunk", "drupe", "dryad", "dryer", "dryly", "duals",
        "ducal", "ducat", "duchy", "ducks", "ducky", "ducts", "dudes",
        "duels", "duets", "duffs", "dufus", "dukes", "dulls", "dully",
        "dulse", "dumbs", "dummy", "dumps", "dumpy", "dunce", "dunch",
        "dunes", "dungs", "dungy", "dunks", "dupes", "durst", "dusks",
        "dusky", "dusts", "dusty", "dutch", "duvet", "duxes", "dwarf",
        "dweeb", "dwell", "dwelt", "dyads", "dying", "dykes", "dynes",
        "eager", "eagle", "eagre", "eared", "earls", "early", "earns",
        "earth", "eased", "easel", "eases", "easts", "eaten", "eater",
        "eaved", "eaves", "ebbed", "ebony", "echos", "eclat", "ecrus",
        "edema", "edged", "edger", "edges", "edict", "edify", "edile",
        "edits", "educe", "educt", "eensy", "eerie", "egged", "egret",
        "eider", "eight", "eikon", "eject", "eking", "eland", "elans",
        "elate", "elbow", "elder", "elect", "elegy", "elfin", "elide",
        "elite", "elope", "elude", "elven", "elves", "email", "embed",
        "ember", "emcee", "emeer", "emend", "emery", "emirs", "emits",
        "emmet", "emoji", "emote", "empty", "enact", "ended", "ender",
        "endow", "endue", "enema", "enemy", "enjoy", "ennui", "enrol",
        "ensue", "enter", "entry", "envoy", "epact", "epees", "epics",
        "epoch", "epoxy", "equal", "equip", "erase", "erect", "ergot",
        "erica", "erode", "erred", "error", "erupt", "esker", "essay",
        "esses", "ester", "estop", "etape", "ether", "ethic", "ethos",
        "ethyl", "etude", "etuis", "etwee", "euros", "evade", "evens",
        "event", "evert", "every", "evict", "evils", "evoke", "ewers",
        "exact", "exalt", "exams", "excel", "execs", "exert", "exile",
        "exist", "exits", "expel", "expos", "extol", "extra", "exude",
        "exult", "exurb", "eyers", "eying", "eyots", "eyrie", "fable",
        "faced", "facer", "faces", "facet", "facia", "facts", "faded",
        "fader", "fades", "fadge", "fados", "faery", "fagot", "fails",
        "fains", "faint", "fairs", "fairy", "faith", "faked", "faker",
        "fakes", "fakir", "falls", "false", "famed", "fames", "fancy",
        "fanes", "fangs", "fanny", "fanos", "faqir", "farad", "farce",
        "fared", "farer", "fares", "farms", "faros", "farts", "fasts",
        "fatal", "fated", "fates", "fatso", "fatty", "fatwa", "fauld",
        "fault", "fauna", "fauns", "favas", "faves", "favor", "favus",
        "fawns", "fawny", "faxed", "faxes", "fazed", "fazes", "fears",
        "feast", "feats", "fecal", "feces", "feeds", "feels", "feign",
        "feint", "fella", "fells", "felly", "felon", "felts", "femme",
        "femur", "fence", "fends", "fenny", "feral", "ferly", "ferns",
        "ferny", "ferry", "fests", "fetal", "fetas", "fetch", "feted",
        "fetes", "fetid", "fetor", "fetus", "feuds", "fever", "fewer",
        "fezes", "fiber", "fibre", "fiche", "ficus", "fidos", "fiefs",
        "field", "fiend", "fiery", "fifer", "fifes", "fifth", "fifty",
        "fight", "filch", "filed", "filer", "files", "filet", "filks",
        "fills", "filly", "films", "filmy", "filos", "filth", "filum",
        "final", "finch", "finds", "fined", "finer", "fines", "finis",
        "finks", "finny", "fiord", "fired", "fires", "firms", "first",
        "firth", "fishy", "fists", "fiver", "fives", "fixed", "fixer",
        "fixes", "fixit", "fizzy", "fjord", "flabs", "flack", "flags",
        "flail", "flair", "flake", "flaks", "flaky", "flame", "flank",
        "flans", "flaps", "flare", "flash", "flask", "flats", "flaws",
        "flaxy", "flays", "fleam", "fleas", "fleck", "fleer", "flees",
        "fleet", "flesh", "fleys", "flick", "flier", "flies", "fling",
        "flint", "flips", "flirt", "flits", "float", "flock", "floes",
        "flogs", "flood", "floor", "flops", "flora", "floss", "flour",
        "flout", "flown", "flows", "flubs", "flues", "fluff", "fluid",
        "fluke", "flume", "flung", "flunk", "fluor", "flush", "flute",
        "fluty", "flyby", "flyer", "foals", "foams", "foamy", "focal",
        "focus", "fogey", "foggy", "fogie", "fohns", "foist", "folds",
        "folic", "folio", "folks", "folky", "folly", "fondu", "fonts",
        "foods", "fools", "footy", "foray", "force", "fords", "forge",
        "forgo", "forks", "forms", "forte", "forth", "forts", "forty",
        "forum", "fouls", "found", "fount", "fours", "fovea", "fowls",
        "foxed", "foxes", "foyer", "frags", "frail", "frame", "franc",
        "frank", "frats", "fraud", "frays", "freak", "freed", "freer",
        "frees", "fresh", "frets", "friar", "fried", "fries", "frill",
        "frisk", "frith", "fritz", "frizz", "frock", "frogs", "frond",
        "front", "frore", "frosh", "frost", "froth", "frown", "frows",
        "froze", "fruit", "frump", "fudge", "fuels", "fugal", "fugue",
        "fugus", "fully", "fumed", "fumer", "fumes", "fundi", "funds",
        "fungi", "funks", "funky", "funny", "furls", "furor", "furry",
        "furze", "furzy", "fused", "fusee", "fuses", "fusil", "fussy",
        "fusty", "futon", "fuzed", "fuzee", "fuzes", "fuzil", "fuzzy",
        "gabby", "gable", "gaffe", "gager", "gaily", "gains", "gaits",
        "galas", "gales", "galls", "gamed", "gamer", "games", "gamey",
        "gamin", "gamma", "gamut", "ganef", "gangs", "ganja", "gaped",
        "gaper", "gapes", "garbs", "garth", "gases", "gasps", "gassy",
        "gated", "gates", "gator", "gauds", "gaudy", "gauge", "gaunt",
        "gauss", "gauze", "gauzy", "gavel", "gawks", "gawky", "gayer",
        "gayly", "gazed", "gazer", "gazes", "gears", "gecko", "geeks",
        "geeky", "geese", "gelds", "gelid", "gemot", "genes", "genie",
        "genii", "genoa", "genre", "gents", "genus", "geode", "germs",
        "germy", "gesso", "gests", "getup", "ghees", "ghost", "ghoul",
        "giant", "gibes", "giddy", "gifts", "gilds", "gills", "gilly",
        "gimel", "gimme", "gimps", "gimpy", "ginny", "gipsy", "girds",
        "girls", "girly", "girth", "girts", "gists", "given", "giver",
        "gives", "gizmo", "glade", "glair", "gland", "glans", "glare",
        "glary", "glass", "glaze", "glazy", "gleam", "glean", "glebe",
        "glede", "gleed", "gleek", "gleet", "glens", "glide", "glint",
        "glitz", "gloat", "globe", "globs", "gloms", "gloom", "glops",
        "glory", "gloss", "glove", "glows", "gloze", "glued", "glues",
        "gluey", "glugs", "glume", "gluts", "glyph", "gnarl", "gnash",
        "gnats", "gnaws", "gnome", "goads", "goals", "goats", "godly",
        "goers", "goest", "going", "golds", "golem", "golfs", "golly",
        "gombo", "gonad", "goner", "gongs", "gonzo", "goods", "goody",
        "gooey", "goofs", "goofy", "goons", "goops", "goopy", "goose",
        "goral", "gored", "gores", "gorge", "gorps", "gorse", "gouge",
        "gourd", "gouts", "gouty", "gowns", "goxes", "grabs", "grace",
        "grade", "grads", "graft", "grail", "grain", "grama", "grams",
        "grana", "grand", "grant", "grape", "graph", "grasp", "grass",
        "grate", "grave", "gravy", "grays", "graze", "great", "grebe",
        "greed", "greek", "green", "greet", "greys", "grids", "grief",
        "grift", "grike", "grill", "grime", "grimy", "grind", "grins",
        "gripe", "grips", "grist", "grits", "groan", "groat", "grogs",
        "groin", "groom", "grope", "gross", "group", "grout", "grove",
        "growl", "grown", "grows", "grubs", "gruel", "gruff", "grump",
        "grunt", "guano", "guard", "guava", "guess", "guest", "guide",
        "guild", "guile", "guilt", "guise", "gulag", "gulch", "gules",
        "gulfs", "gulls", "gully", "gulps", "gumbo", "gummy", "gunks",
        "gunny", "guppy", "gurus", "gushy", "gusto", "gusts", "gusty",
        "gutsy", "guyed", "gybed", "gybes", "gypsy", "gyred", "gyres",
        "gyros", "haafs", "habit", "hacks", "hadji", "hafts", "haiku",
        "hails", "hairs", "hairy", "hajis", "haler", "hales", "halfs",
        "hallo", "halls", "halos", "halts", "halve", "hamal", "hance",
        "hands", "handy", "hangs", "hanks", "hanky", "hants", "happy",
        "hardy", "harem", "hares", "harks", "harms", "harps", "harpy",
        "harry", "harsh", "harts", "hasps", "haste", "hasty", "hatch",
        "hated", "hater", "hates", "hauls", "haunt", "haute", "haven",
        "haver", "haves", "havoc", "hawks", "hazed", "hazel", "hazer",
        "hazes", "heads", "heady", "heals", "heaps", "heard", "hears",
        "heart", "heath", "heats", "heave", "heavy", "hecks", "hedge",
        "heeds", "heels", "hefts", "hefty", "heirs", "heist", "helix",
        "hello", "hells", "helms", "helot", "helps", "helve", "hemps",
        "hence", "henna", "herbs", "herds", "herns", "heron", "heros",
        "hertz", "hewed", "hexed", "hexer", "hexes", "hicks", "hides",
        "highs", "hight", "hijab", "hiked", "hiker", "hikes", "hills",
        "hilly", "hilts", "hilum", "hilus", "hinds", "hinge", "hinny",
        "hints", "hippo", "hippy", "hired", "hirer", "hires", "hitch",
        "hives", "hoagy", "hoard", "hoars", "hoary", "hobby", "hobos",
        "hocks", "hocus", "hogan", "hoise", "hoist", "hokey", "hokum",
        "holds", "holed", "holes", "holey", "holly", "homed", "homer",
        "homes", "homey", "honed", "hones", "honey", "honks", "honor",
        "hooch", "hoods", "hooey", "hoofs", "hooka", "hooks", "hooky",
        "hoops", "hoots", "hoped", "hoper", "hopes", "horas", "horde",
        "horns", "horny", "horse", "horst", "horsy", "hosed", "hoses",
        "hosts", "hotel", "hotly", "hound", "houri", "hours", "house",
        "hovel", "hover", "howdy", "howff", "howls", "hubby", "huffs",
        "huffy", "huger", "hulas", "hulks", "hulky", "hullo", "hulls",
        "human", "humic", "humid", "humor", "humph", "humps", "humpy",
        "humus", "hunch", "hunks", "hunky", "hunts", "hurls", "hurry",
        "hurst", "hurts", "husks", "husky", "hussy", "hutch", "huzza",
        "hydra", "hydro", "hyena", "hying", "hymen", "hymns", "hyoid",
        "hyped", "hyper", "hypes", "hypos", "hyrax", "iambs", "ichor",
        "icier", "icily", "icing", "icons", "ictus", "ideal", "ideas",
        "idiom", "idiot", "idled", "idler", "idles", "idols", "idyll",
        "idyls", "igloo", "ihram", "ileum", "iliac", "ilium", "image",
        "imago", "imams", "imbed", "imbue", "imide", "impel", "imply",
        "inane", "inapt", "inbox", "incur", "incus", "index", "indie",
        "inept", "inert", "infer", "infix", "infos", "infra", "ingle",
        "ingot", "inked", "inlay", "inlet", "inner", "input", "inset",
        "intel", "inter", "intro", "inure", "inurn", "iodic", "iodid",
        "ionic", "iotas", "irate", "irids", "irked", "irons", "irony",
        "isled", "isles", "islet", "issue", "itchy", "items", "ivied",
        "ivies", "ivory", "ixias", "izars", "jabot", "jacal", "jacks",
        "jaded", "jades", "jaggy", "jails", "jakes", "jambs", "japed",
        "japer", "japes", "jarls", "jatos", "jauks", "jaunt", "jazzy",
        "jeans", "jeeps", "jeers", "jefes", "jehad", "jelly", "jeons",
        "jerid", "jerks", "jerky", "jerry", "jests", "jetes", "jetty",
        "jewel", "jibed", "jibes", "jiffs", "jiffy", "jihad", "jilts",
        "jimmy", "jinks", "jinni", "jinns", "jisms", "jived", "jiver",
        "jives", "jnana", "jocks", "joeys", "johns", "joins", "joint",
        "joist", "joked", "joker", "jokes", "jolly", "jolts", "jorum",
        "joule", "joust", "jowed", "jowls", "jowly", "judas", "judge",
        "judos", "jugal", "juice", "juicy", "juked", "jukes", "julep",
        "jumbo", "jumps", "jumpy", "junco", "junky", "junta", "junto",
        "jurat", "jures", "juror", "jutes", "kabab", "kabob", "kafir",
        "kaids", "kalif", "kanji", "kappa", "karat", "karma", "karoo",
        "karst", "kasha", "kayak", "kayos", "kazoo", "kebab", "kedge",
        "keels", "keens", "keeps", "kefir", "kelps", "kelpy", "kempt",
        "kerbs", "kerns", "ketch", "kexes", "keyed", "keyer", "khaki",
        "kicks", "kiddo", "kills", "kilns", "kilos", "kilts", "kinds",
        "kings", "kinks", "kinky", "kiosk", "kissy", "kited", "kiter",
        "kites", "kithe", "kitty", "kivas", "kiwis", "klutz", "knack",
        "knarl", "knave", "knead", "kneed", "kneel", "knees", "knell",
        "knelt", "knife", "knish", "knits", "knobs", "knock", "knoll",
        "knots", "knout", "known", "knows", "knurl", "koala", "koans",
        "kobos", "koine", "konks", "kooks", "kooky", "kopek", "kophs",
        "kopje", "koros", "kraal", "kraut", "krill", "krona", "kudos",
        "kudzu", "kugel", "label", "labia", "labor", "laced", "laces",
        "lacey", "lacks", "laden", "lades", "ladle", "lagan", "lager",
        "laiks", "laird", "lairs", "laity", "lakes", "lakhs", "lamas",
        "lambs", "lamer", "lames", "lamia", "lamps", "lance", "lands",
        "lanes", "lanky", "lapel", "lapis", "lapse", "larch", "lards",
        "large", "larks", "larva", "lased", "laser", "lases", "lasso",
        "lasts", "latch", "later", "latex", "lathe", "laths", "latte",
        "lauds", "laugh", "lavas", "laved", "laves", "lawns", "laxer",
        "laxly", "layed", "layer", "layup", "lazed", "lazes", "leach",
        "leads", "leafs", "leafy", "leaks", "leaky", "leans", "leant",
        "leaps", "leapt", "learn", "lease", "leash", "least", "leave",
        "ledes", "ledge", "ledgy", "leech", "leeks", "leers", "leery",
        "lefts", "lefty", "legal", "leggy", "legit", "lemma", "lemon",
        "lemur", "lends", "lenis", "lento", "leone", "leper", "lethe",
        "levee", "level", "lever", "lexes", "lexis", "lezes", "liana",
        "libel", "libra", "licit", "licks", "lidar", "liege", "liens",
        "lifer", "lifts", "light", "liked", "liken", "likes", "lilac",
        "lilts", "limas", "limbo", "limbs", "limes", "limey", "limit",
        "limns", "limos", "limps", "lined", "linen", "liner", "lines",
        "lingo", "links", "linns", "lints", "linty", "lipid", "lippy",
        "liras", "lisps", "lists", "liter", "lithe", "litre", "lived",
        "liver", "lives", "livid", "llama", "loads", "loafs", "loams",
        "loamy", "loans", "loath", "lobar", "lobby", "lobed", "lobes",
        "local", "lochs", "locks", "locus", "loden", "lodge", "loess",
        "lofts", "lofty", "logan", "logia", "logic", "login", "logos",
        "loins", "lolls", "lolly", "loner", "longs", "looks", "looms",
        "loons", "loony", "loops", "loopy", "loose", "loots", "loped",
        "lopes", "lords", "lores", "loris", "lorry", "losel", "loser",
        "loses", "lossy", "lotto", "lotus", "louis", "loupe", "louse",
        "lousy", "louts", "loved", "lover", "loves", "lowed", "lower",
        "lowes", "lowly", "loxes", "loyal", "luaus", "lubes", "lucid",
        "lucks", "lucky", "lucre", "ludes", "luger", "luges", "lulls",
        "lulus", "lumen", "lumps", "lumpy", "lunar", "lunas", "lunch",
        "lunes", "lunge", "lungs", "lunks", "lupin", "lupus", "lurch",
        "lured", "lurer", "lures", "lurid", "lurks", "lusts", "lusty",
        "lutes", "lyart", "lying", "lymph", "lynch", "lyres", "lyric",
        "macaw", "maced", "macer", "maces", "macho", "macro", "madam",
        "madly", "mafia", "mages", "magic", "magma", "magus", "maids",
        "mails", "maims", "mains", "maize", "major", "maker", "makes",
        "malar", "males", "malic", "malls", "malts", "malty", "mamas",
        "mamba", "mambo", "mamma", "mammy", "manas", "maned", "manes",
        "manga", "mange", "mango", "mangy", "mania", "manic", "manly",
        "manna", "manor", "manse", "maple", "maqui", "march", "mares",
        "marge", "marks", "marry", "marsh", "marts", "maser", "masks",
        "mason", "masse", "massy", "masts", "match", "mated", "mater",
        "mates", "matey", "maths", "matte", "matzo", "mauls", "mauve",
        "maven", "mawed", "maxed", "maxes", "maxim", "maxis", "maybe",
        "mayor", "mazer", "mazes", "mbira", "meads", "meals", "mealy",
        "means", "meant", "meany", "meats", "meaty", "mecca", "medal",
        "media", "medic", "meets", "melds", "melee", "melon", "melts",
        "memes", "memos", "menad", "mends", "mensa", "meows", "mercy",
        "merge", "merit", "merle", "merry", "mesas", "meson", "messy",
        "metal", "meted", "meter", "metes", "metis", "metre", "metro",
        "mewed", "mewls", "mezzo", "miaou", "miaow", "micas", "micks",
        "micky", "micro", "midge", "midis", "midst", "miens", "miffs",
        "might", "miked", "mikes", "miles", "milks", "milky", "mills",
        "milos", "milts", "mimed", "mimeo", "mimer", "mimes", "mimic",
        "mimsy", "mince", "minds", "mined", "miner", "mines", "minim",
        "minis", "minks", "minor", "mints", "minty", "minus", "mired",
        "mires", "mirks", "mirky", "mirth", "miser", "missy", "mists",
        "misty", "miter", "mites", "mitis", "mitre", "mitts", "mixed",
        "mixer", "mixes", "mixup", "moats", "mocha", "mocks", "modal",
        "model", "modem", "modes", "mogul", "mohur", "moire", "moist",
        "mojos", "molal", "molar", "molds", "moldy", "moles", "molls",
        "molly", "molts", "momma", "mommy", "monad", "mondo", "money",
        "monks", "monos", "monte", "month", "mooch", "moods", "moody",
        "mooed", "moola", "moons", "moony", "moors", "moose", "moots",
        "moped", "mopes", "mopey", "morae", "moral", "moras", "moray",
        "morel", "mores", "morns", "moron", "morph", "mosey", "mossy",
        "motel", "motes", "motet", "moths", "motif", "motor", "motte",
        "motto", "mould", "moult", "mound", "mount", "mourn", "mouse",
        "mousy", "mouth", "moved", "mover", "moves", "movie", "mowed",
        "mower", "moxie", "mucks", "mucky", "mucus", "muddy", "muffs",
        "mufti", "muggy", "mulch", "mulct", "mules", "mummy", "mumps",
        "mumus", "munch", "muons", "mural", "murex", "murks", "murky",
        "mused", "muser", "muses", "mushy", "music", "musks", "musky",
        "musts", "musty", "muted", "mutes", "mutts", "muxes", "muzak",
        "mynah", "mynas", "myoma", "myrrh", "myths", "nabob", "nacho",
        "nacre", "nadir", "naffs", "naiad", "naifs", "nails", "naira",
        "naive", "naked", "named", "namer", "names", "nanny", "nappe",
        "nappy", "narcs", "nares", "naris", "narks", "nasal", "nasty",
        "natal", "natch", "nates", "natty", "naval", "navel", "naves",
        "navvy", "nawab", "nears", "neath", "necks", "needs", "needy",
        "neeps", "negro", "negus", "neifs", "neigh", "neons", "nerds",
        "nerdy", "nertz", "nerve", "nervy", "nests", "never", "newel",
        "newer", "newly", "newsy", "newts", "nexus", "nicer", "niche",
        "nicks", "nidus", "niece", "nieve", "nifty", "night", "nills",
        "niner", "nines", "ninja", "ninny", "ninth", "nippy", "niqab",
        "niter", "nitre", "nitro", "nitty", "nixed", "nixer", "nixes",
        "nixie", "nizam", "noble", "nobly", "nodal", "nodes", "noise",
        "noisy", "nomad", "nomes", "nonce", "nones", "nooks", "noons",
        "noose", "norms", "north", "nosed", "noses", "nosey", "notch",
        "noted", "notes", "nouns", "novae", "novas", "novel", "nudes",
        "nudge", "nudzh", "nuked", "nukes", "nulls", "numbs", "numen",
        "nurse", "nutty", "nylon", "nymph", "oaken", "oakum", "oared",
        "oases", "oasis", "oaths", "obese", "obeys", "obits", "oboes",
        "occur", "ocean", "ochre", "octal", "octet", "odder", "oddly",
        "odium", "odors", "odour", "offal", "offed", "offer", "often",
        "ofter", "ogham", "ogive", "ogled", "ogler", "ogles", "ogres",
        "ohias", "ohing", "ohmic", "oiled", "oiler", "okapi", "okays",
        "okras", "olden", "older", "oldie", "oleic", "olive", "ology",
        "ombre", "omega", "omens", "omits", "onion", "onset", "oohed",
        "oomph", "oorie", "oozed", "oozes", "opals", "opens", "opera",
        "opine", "opium", "opted", "optic", "orals", "orate", "orbed",
        "orbit", "orcas", "order", "oread", "organ", "oriel", "osier",
        "other", "otter", "ought", "ounce", "ourie", "ousel", "ousts",
        "outdo", "outed", "outer", "outgo", "outre", "ouzel", "ouzos",
        "ovals", "ovary", "ovate", "ovens", "overs", "overt", "ovine",
        "ovoid", "ovule", "owing", "owlet", "owned", "owner", "oxbow",
        "oxeye", "oxide", "oxids", "oxime", "oxter", "ozone", "paced",
        "pacer", "paces", "packs", "pacts", "paddy", "padre", "paean",
        "pagan", "paged", "pager", "pages", "pails", "pains", "paint",
        "pairs", "paled", "paler", "pales", "palls", "pally", "palms",
        "palmy", "palsy", "panda", "paned", "panel", "panes", "pangs",
        "panic", "pansy", "panto", "pants", "panty", "papal", "papas",
        "papaw", "paper", "pappy", "parch", "pared", "parer", "pares",
        "parka", "parks", "parry", "parse", "parts", "party", "pasha",
        "passe", "pasta", "paste", "pasts", "pasty", "patch", "pated",
        "pater", "pates", "paths", "patio", "patsy", "patty", "pause",
        "paved", "paver", "paves", "pawed", "pawls", "pawns", "payee",
        "payer", "payor", "peace", "peach", "peaks", "peaky", "peals",
        "peans", "pearl", "pears", "pease", "peats", "peaty", "pecan",
        "pecks", "pedal", "peeks", "peels", "peens", "peeps", "peers",
        "peeve", "pelts", "penal", "pence", "pends", "penes", "penis",
        "penna", "penne", "penny", "peons", "peony", "perch", "peres",
        "peril", "perks", "perky", "perms", "perry", "perse", "pesky",
        "pesos", "pesto", "pests", "petal", "peter", "petit", "petty",
        "pewee", "phage", "phase", "phial", "phlox", "phone", "phono",
        "phony", "photo", "phots", "phyla", "piano", "picas", "picks",
        "picky", "piece", "piers", "piety", "piggy", "pigmy", "piked",
        "piker", "pikes", "pilaf", "piled", "piles", "pills", "pilot",
        "pimps", "pinch", "pined", "pines", "piney", "pings", "pinks",
        "pinky", "pinna", "pinny", "pinta", "pinto", "pints", "pinup",
        "pions", "pious", "piped", "piper", "pipes", "pipit", "pique",
        "piste", "pitas", "pitch", "piths", "pithy", "pivot", "pixel",
        "pixes", "pixie", "pizza", "place", "plaid", "plain", "plait",
        "plane", "plank", "plans", "plant", "plash", "plasm", "plate",
        "playa", "plays", "plaza", "plead", "pleas", "pleat", "plebe",
        "plied", "plier", "plies", "plink", "plods", "plonk", "plops",
        "plots", "plows", "ploys", "pluck", "plugs", "plumb", "plume",
        "plump", "plums", "plunk", "plush", "plyer", "poach", "pocks",
        "podgy", "podia", "poems", "poesy", "poets", "pogos", "point",
        "poise", "poked", "poker", "pokes", "pokey", "polar", "poled",
        "poles", "polio", "polis", "polka", "polls", "polos", "polyp",
        "pomps", "ponce", "ponds", "pongs", "pooch", "poofs", "poofy",
        "poohs", "pooka", "pools", "poons", "poops", "poori", "popes",
        "poppy", "porch", "pored", "pores", "porks", "porno", "ports",
        "posed", "poser", "poses", "posey", "posit", "posse", "posts",
        "potty", "pouch", "poufs", "pound", "pours", "pouts", "pouty",
        "power", "poxes", "prams", "prank", "prate", "prats", "prawn",
        "prays", "preen", "preps", "press", "prexy", "preys", "price",
        "prick", "pride", "pried", "pries", "prigs", "prima", "prime",
        "primo", "primp", "print", "prion", "prior", "prise", "prism",
        "privy", "prize", "probe", "prods", "proem", "profs", "prole",
        "promo", "proms", "prone", "prong", "proof", "props", "prose",
        "prosy", "proud", "prove", "prowl", "prows", "proxy", "prude",
        "prune", "psalm", "pseud", "pshaw", "psych", "pubes", "pubic",
        "pubis", "puces", "pucks", "pudge", "pudgy", "pudic", "puffs",
        "puffy", "pukas", "puked", "pukes", "pukka", "pulls", "pulps",
        "pulpy", "pulse", "pumas", "pumps", "punch", "punks", "punts",
        "pupae", "pupal", "pupas", "pupil", "puppy", "puree", "purer",
        "purge", "puris", "purls", "purrs", "purse", "pushy", "pussy",
        "putts", "putty", "pygmy", "pylon", "pyres", "pyric", "pyxis",
        "qaids", "qanat", "qophs", "quack", "quads", "quaff", "quags",
        "quail", "quais", "quake", "quaky", "quale", "qualm", "quant",
        "quare", "quark", "quart", "quash", "quasi", "quays", "qubit",
        "quean", "queen", "queer", "quell", "quern", "query", "quest",
        "queue", "queys", "quick", "quids", "quiet", "quill", "quilt",
        "quint", "quips", "quipu", "quire", "quirk", "quirt", "quite",
        "quits", "quods", "quoin", "quoit", "quota", "quote", "quoth",
        "qursh", "rabat", "rabbi", "rabid", "raced", "racer", "races",
        "racks", "radar", "radii", "radio", "radix", "radon", "rafts",
        "ragas", "raged", "rager", "rages", "raids", "rails", "rains",
        "rainy", "raise", "raita", "rajah", "rajas", "raked", "raker",
        "rakes", "rally", "ralph", "ramen", "ramps", "ranch", "rands",
        "randy", "range", "ranks", "rants", "raped", "rapes", "rapid",
        "rarer", "rasps", "raspy", "rated", "rates", "ratio", "ratty",
        "raved", "ravel", "raven", "raver", "raves", "raxes", "rayon",
        "razed", "razer", "razes", "razor", "reach", "react", "readd",
        "reads", "ready", "realm", "reals", "reams", "reaps", "rearm",
        "rears", "reata", "reave", "rebar", "rebel", "rebid", "rebus",
        "rebut", "recap", "recon", "recta", "recto", "recur", "recut",
        "redid", "redux", "reeds", "reedy", "reefs", "reeks", "reels",
        "reeve", "refer", "refit", "regal", "rehab", "reify", "reign",
        "reins", "relax", "relay", "relic", "relit", "remap", "remit",
        "remix", "renal", "rends", "renew", "rents", "reoil", "reorg",
        "repay", "repel", "reply", "repos", "reran", "rerun", "resat",
        "resay", "reset", "resew", "resin", "rests", "retag", "retch",
        "retie", "retro", "retry", "reuse", "revel", "revue", "rewax",
        "rheum", "rhino", "rhumb", "rhyme", "riata", "riced", "ricer",
        "rices", "ricin", "rider", "rides", "ridge", "riffs", "rifle",
        "rifts", "right", "rigid", "rigor", "riled", "riles", "rille",
        "rills", "rimer", "rimes", "rinds", "rings", "rinks", "rinse",
        "rioja", "riots", "riped", "ripen", "riper", "ripes", "risen",
        "riser", "rises", "rishi", "risks", "risky", "rites", "ritzy",
        "rival", "riven", "river", "rives", "rivet", "roach", "roads",
        "roams", "roans", "roars", "roast", "robed", "robes", "robin",
        "robot", "rocks", "rocky", "rodeo", "roger", "rogue", "roils",
        "roist", "roles", "rolls", "roman", "romps", "rondo", "roofs",
        "rooks", "rooky", "rooms", "roomy", "roost", "roots", "roped",
        "ropes", "roque", "roses", "rosin", "rotas", "rotes", "rotis",
        "rotor", "rouge", "rough", "round", "rouse", "route", "routs",
        "rover", "rowan", "rowdy", "rowed", "rowel", "rower", "royal",
        "rubes", "ruble", "ruddy", "ruder", "ruffs", "rugby", "ruing",
        "ruins", "ruled", "ruler", "rules", "rumba", "rumen", "rummy",
        "rumor", "rumps", "runes", "rungs", "runic", "runny", "runts",
        "runty", "rupee", "rural", "ruses", "rusks", "rusts", "rusty",
        "ruths", "rutty", "saber", "sabir", "sable", "sabot", "sabre",
        "sacks", "sacra", "sadly", "safer", "safes", "sagas", "sages",
        "saggy", "sahib", "sails", "saint", "saith", "saker", "sakes",
        "sakis", "salad", "sales", "sally", "salon", "salsa", "salts",
        "salty", "salve", "salvo", "samba", "sambo", "sands", "sandy",
        "saner", "sapid", "sappy", "sarge", "sarin", "saris", "sarks",
        "sassy", "sated", "sates", "satin", "satyr", "sauce", "saucy",
        "sault", "sauna", "saute", "saved", "saver", "saves", "savor",
        "savoy", "savvy", "sawed", "sawer", "saxes", "sayer", "sayst",
        "scabs", "scads", "scags", "scald", "scale", "scalp", "scaly",
        "scamp", "scams", "scans", "scant", "scape", "scare", "scarf",
        "scarp", "scars", "scary", "scats", "scaup", "scene", "scent",
        "schwa", "scion", "scoff", "scold", "scone", "scoop", "scoot",
        "scope", "score", "scorn", "scour", "scout", "scowl", "scows",
        "scram", "scrap", "scraw", "scree", "screw", "scrim", "scrip",
        "scrub", "scrum", "scuba", "scuds", "scuff", "scull", "scums",
        "scurf", "scuts", "scuzz", "seals", "seams", "seamy", "sears",
        "seats", "sebum", "sects", "sedan", "seder", "sedge", "seeds",
        "seedy", "seeks", "seems", "seeps", "seers", "segue", "seize",
        "selfs", "sells", "semen", "semis", "sends", "sense", "sepal",
        "sepia", "sepoy", "serfs", "serif", "serin", "serum", "serve",
        "servo", "setup", "seven", "sever", "sewed", "sewer", "sexed",
        "sexes", "sexts", "shack", "shade", "shady", "shaft", "shags",
        "shahs", "shake", "shako", "shaky", "shale", "shall", "shalt",
        "shame", "shams", "shank", "shape", "shard", "share", "shark",
        "sharp", "shave", "shawl", "shays", "sheaf", "shear", "sheds",
        "sheen", "sheep", "sheer", "sheet", "sheik", "shelf", "shell",
        "sheol", "shewn", "shied", "shift", "shill", "shims", "shine",
        "shins", "shiny", "ships", "shire", "shirk", "shirt", "shiva",
        "shivs", "shlep", "shoal", "shoat", "shock", "shoed", "shoes",
        "shoji", "shone", "shook", "shoot", "shops", "shore", "shorn",
        "short", "shots", "shout", "shove", "shown", "shows", "showy",
        "shred", "shrew", "shrub", "shrug", "shuck", "shuns", "shunt",
        "shush", "shuts", "shyly", "sicko", "sicks", "sicky", "sided",
        "sides", "sidle", "siege", "sieve", "sifts", "sighs", "sight",
        "sigil", "sigma", "signs", "silks", "silky", "sills", "silly",
        "silos", "silts", "silty", "simar", "simps", "since", "sines",
        "sinew", "singe", "sings", "sinks", "sinus", "sired", "siren",
        "sires", "sirup", "sisal", "sissy", "sitar", "sites", "situs",
        "sixes", "sixth", "sixty", "sizar", "sized", "sizer", "sizes",
        "skate", "skats", "skeet", "skein", "skene", "skews", "skids",
        "skied", "skier", "skies", "skiff", "skill", "skimp", "skims",
        "skink", "skins", "skint", "skips", "skirt", "skits", "skive",
        "skulk", "skull", "skunk", "slabs", "slack", "slade", "slags",
        "slain", "slake", "slams", "slang", "slant", "slaps", "slash",
        "slate", "slats", "slave", "slaws", "slays", "sleds", "sleek",
        "sleep", "sleet", "slept", "slice", "slick", "slide", "slier",
        "slily", "slime", "slims", "slimy", "sling", "slink", "slips",
        "slits", "slobs", "sloes", "slogs", "sloop", "slope", "slops",
        "slosh", "sloth", "slots", "slows", "sluff", "slugs", "slump",
        "slums", "slung", "slunk", "slurp", "slurs", "slush", "sluts",
        "slyly", "smack", "small", "smalt", "smarm", "smart", "smash",
        "smear", "smell", "smelt", "smile", "smirk", "smite", "smith",
        "smock", "smoke", "smoky", "smote", "smuts", "snack", "snafu",
        "snags", "snail", "snake", "snaky", "snaps", "snare", "snarf",
        "snark", "snarl", "sneak", "sneck", "sneer", "snell", "snick",
        "snide", "sniff", "snipe", "snips", "snits", "snobs", "snogs",
        "snood", "snoop", "snore", "snort", "snots", "snout", "snows",
        "snowy", "snubs", "snuck", "snuff", "snugs", "soaks", "soaps",
        "soapy", "soars", "soave", "sobas", "sober", "socks", "sodas",
        "soddy", "sodic", "sofas", "softy", "soggy", "soils", "solar",
        "soled", "soles", "solid", "solos", "solum", "solve", "sonar",
        "sonde", "songs", "sonic", "sonny", "sooey", "sooth", "soots",
        "sooty", "sorer", "sores", "sorry", "sorts", "sough", "souls",
        "sound", "soups", "soupy", "sours", "souse", "south", "sower",
        "space", "spacy", "spade", "spake", "spall", "spams", "spank",
        "spans", "spare", "spark", "spars", "spasm", "spate", "spats",
        "spawn", "spays", "spazz", "speak", "spear", "speck", "specs",
        "speed", "spell", "spelt", "spend", "spent", "sperm", "spews",
        "spica", "spice", "spicy", "spied", "spiel", "spies", "spiff",
        "spifs", "spike", "spiky", "spill", "spilt", "spine", "spins",
        "spiny", "spire", "spite", "spits", "spitz", "splat", "splay",
        "split", "spoil", "spoke", "spoof", "spook", "spool", "spoon",
        "spoor", "spore", "sport", "spots", "spout", "sprat", "spray",
        "spree", "sprig", "sprue", "spuds", "spume", "spunk", "spurn",
        "spurs", "spurt", "squab", "squad", "squat", "squaw", "squeg",
        "squib", "squid", "stabs", "stack", "staff", "stage", "stags",
        "stagy", "staid", "stain", "stair", "stake", "stale", "stalk",
        "stall", "stamp", "stand", "stang", "stank", "staph", "stare",
        "stark", "stars", "start", "stash", "state", "stats", "stave",
        "stays", "stead", "steak", "steal", "steam", "steed", "steel",
        "steep", "steer", "stein", "stela", "stele", "stems", "steno",
        "stent", "steps", "stern", "stews", "stick", "sties", "stiff",
        "stile", "still", "stilt", "sting", "stink", "stint", "stipe",
        "stirk", "stirs", "stoat", "stock", "stoic", "stoke", "stole",
        "stoma", "stomp", "stone", "stony", "stood", "stool", "stoop",
        "stope", "stops", "store", "stork", "storm", "story", "stour",
        "stout", "stove", "stows", "strap", "straw", "stray", "strep",
        "strew", "stria", "strip", "strop", "strum", "strut", "stubs",
        "stuck", "studs", "study", "stuff", "stump", "stung", "stunk",
        "stuns", "stunt", "stupa", "style", "styli", "suave", "sucks",
        "sudor", "sudsy", "suede", "suets", "sugar", "suing", "suite",
        "suits", "sulks", "sulky", "sully", "sumac", "summa", "sumos",
        "sunna", "sunny", "sunup", "super", "supra", "surer", "surfs",
        "surge", "surly", "sushi", "sutra", "swabs", "swage", "swags",
        "swain", "swale", "swami", "swamp", "swang", "swank", "swans",
        "swaps", "sward", "swarf", "swarm", "swart", "swash", "swath",
        "swats", "sways", "swear", "sweat", "swede", "sweep", "sweet",
        "swell", "swept", "swift", "swigs", "swill", "swims", "swine",
        "swing", "swipe", "swirl", "swish", "swive", "swobs", "swoon",
        "swoop", "swops", "sword", "swore", "sworn", "swung", "sybil",
        "sylph", "synch", "syncs", "synod", "syrup", "tabby", "tabes",
        "tabla", "table", "taboo", "tabor", "tabus", "tacet", "tache",
        "tacit", "tacks", "tacky", "tacos", "tacts", "taffy", "tails",
        "taint", "taken", "taker", "takes", "taler", "tales", "talks",
        "talky", "tally", "talon", "talus", "tamed", "tamer", "tames",
        "tammy", "tamps", "tango", "tangs", "tangy", "tanks", "tansy",
        "tapas", "taped", "taper", "tapes", "tapir", "tapis", "tardy",
        "tared", "tares", "targe", "taros", "tarot", "tarps", "tarry",
        "tarts", "taser", "tases", "tasks", "tasse", "taste", "tasty",
        "tatar", "tater", "tatty", "taunt", "taupe", "tawny", "tawse",
        "taxed", "taxer", "taxes", "taxis", "taxon", "teach", "teaks",
        "teals", "teams", "tears", "teary", "tease", "teats", "teaze",
        "techy", "teddy", "teems", "teens", "teeny", "teeth", "teiid",
        "telex", "tells", "telly", "telos", "tempo", "temps", "tempt",
        "tench", "tends", "tenet", "tenia", "tenon", "tenor", "tense",
        "tenth", "tents", "tepee", "tepid", "terai", "terfs", "terms",
        "terns", "terra", "terse", "tesla", "testa", "tests", "testy",
        "tetes", "tetra", "texts", "thack", "thali", "thane", "thank",
        "thaws", "theft", "thegn", "their", "theme", "there", "therm",
        "these", "theta", "thews", "thick", "thief", "thigh", "thine",
        "thing", "think", "thins", "third", "thong", "thorn", "those",
        "three", "threw", "thrip", "throb", "throe", "throw", "thrum",
        "thuds", "thugs", "thumb", "thump", "thunk", "thyme", "tiara",
        "tibia", "ticks", "tidal", "tided", "tides", "tiers", "tiffs",
        "tiger", "tight", "tilde", "tiled", "tiles", "tills", "tilth",
        "tilts", "timed", "timer", "times", "timid", "tinct", "tined",
        "tines", "tinge", "tinks", "tinny", "tints", "tipis", "tippy",
        "tipsy", "tired", "tires", "titan", "tithe", "title", "titre",
        "titty", "tizzy", "toads", "toady", "toast", "tocks", "today",
        "toddy", "toffs", "toffy", "tofts", "tofus", "togae", "togas",
        "toils", "toked", "token", "toker", "tokes", "toles", "tolls",
        "tombs", "tomes", "tonal", "toned", "toner", "tones", "tonga",
        "tongs", "tonic", "tonne", "tools", "toons", "tooth", "toots",
        "topaz", "toped", "topee", "toper", "topes", "topic", "toque",
        "torah", "torch", "torse", "torso", "torta", "torte", "torts",
        "torus", "total", "toted", "totem", "toter", "totes", "touch",
        "tough", "tours", "touse", "touts", "towed", "towel", "tower",
        "towns", "towny", "toxic", "toxin", "toyed", "toyon", "trace",
        "track", "tract", "trade", "trail", "train", "trait", "tramp",
        "trams", "trank", "tranq", "trans", "traps", "trash", "trave",
        "trawl", "trayf", "trays", "tread", "treat", "treed", "trees",
        "treks", "trend", "tress", "treyf", "treys", "triad", "trial",
        "tribe", "trice", "trick", "tried", "trier", "tries", "trike",
        "trill", "trims", "trios", "tripe", "trips", "trite", "troll",
        "tromp", "troop", "trope", "troth", "trots", "trout", "trove",
        "truce", "truck", "trued", "truer", "trues", "truly", "trump",
        "trunk", "truss", "trust", "truth", "tryst", "tsars", "tsked",
        "tubal", "tubas", "tubby", "tubed", "tuber", "tubes", "tucks",
        "tufas", "tuffs", "tufts", "tules", "tulip", "tulle", "tumid",
        "tummy", "tumor", "tunas", "tuned", "tuner", "tunes", "tunic",
        "tuque", "turbo", "turds", "turfs", "turns", "turps", "tusks",
        "tutee", "tutor", "tutus", "tuxes", "twain", "twang", "tweak",
        "tweed", "tween", "tweet", "twerp", "twice", "twigs", "twine",
        "twins", "twiny", "twirl", "twist", "twits", "twixt", "tying",
        "tykes", "tynes", "typed", "types", "typic", "typos", "tyros",
        "tzars", "udder", "ukase", "ulcer", "ulnae", "ulnar", "ulnas",
        "ultra", "umbel", "umber", "umbra", "umiak", "unarm", "unary",
        "unbid", "unbox", "uncap", "uncle", "uncut", "under", "undid",
        "undue", "unfed", "unfit", "unify", "union", "unite", "units",
        "unity", "unlay", "unlit", "unmet", "unmix", "unpin", "unsay",
        "unsee", "unset", "untie", "until", "unwed", "unzip", "upend",
        "upped", "upper", "upset", "urate", "urban", "urged", "urges",
        "urine", "usage", "users", "usher", "using", "usque", "usual",
        "usurp", "usury", "utile", "utter", "uvula", "vague", "vagus",
        "vails", "vales", "valet", "valid", "valor", "value", "valve",
        "vaned", "vanes", "vaped", "vaper", "vapes", "vapid", "vapor",
        "varia", "varna", "varus", "vases", "vasts", "vasty", "vault",
        "vaunt", "veals", "veeps", "veers", "veery", "vegan", "vegie",
        "veils", "veins", "veiny", "velar", "velds", "veldt", "venal",
        "vends", "venin", "venom", "vents", "venue", "verbs", "verge",
        "verse", "verso", "verve", "vesta", "vests", "vetch", "vexed",
        "vexer", "vexes", "vials", "viand", "vibes", "vicar", "vices",
        "video", "viers", "views", "vigil", "vigor", "viler", "villa",
        "vined", "vines", "vinic", "vinyl", "viola", "viols", "viper",
        "viral", "virid", "virus", "visas", "vises", "visit", "visor",
        "vista", "vital", "vitas", "vivas", "vivid", "vixen", "vizir",
        "vizor", "vocal", "vodka", "vogue", "voice", "voids", "voila",
        "voles", "volta", "volts", "vomer", "vomit", "voted", "voter",
        "votes", "vouch", "vowed", "vowel", "vower", "voxel", "vroom",
        "vrows", "vulva", "vying", "wacke", "wacko", "wacky", "waded",
        "wader", "wades", "wadis", "wafer", "waffs", "wafts", "waged",
        "wager", "wages", "wagga", "wagon", "wahoo", "waifs", "wails",
        "wains", "waist", "waits", "waive", "waked", "waken", "wakes",
        "waldo", "waler", "wales", "walks", "walls", "wally", "waltz",
        "wands", "waned", "wanes", "wanks", "wanly", "wants", "wards",
        "wares", "warms", "warns", "warps", "warts", "warty", "washy",
        "wasps", "waspy", "waste", "watch", "water", "watts", "waved",
        "waver", "waves", "waxed", "waxen", "waxes", "wazir", "wazoo",
        "weald", "wears", "weary", "weave", "weber", "wedge", "weeds",
        "weedy", "weeks", "weens", "weeny", "weeps", "weepy", "wefts",
        "weigh", "weird", "weirs", "welch", "welds", "wells", "welly",
        "welsh", "welts", "wench", "wends", "wests", "whack", "whale",
        "whams", "whaps", "wharf", "whats", "wheal", "wheat", "wheel",
        "whelk", "whelm", "whelp", "whens", "where", "whets", "wheys",
        "which", "whiff", "whigs", "while", "whims", "whine", "whiny",
        "whips", "whirl", "whirr", "whirs", "whish", "whisk", "whist",
        "white", "whits", "whizz", "whole", "whoop", "whops", "whore",
        "whose", "whump", "widen", "wider", "widow", "width", "wield",
        "wifed", "wifes", "wifey", "wight", "wikis", "wilds", "wiles",
        "wills", "willy", "wilts", "wimps", "wimpy", "wince", "winch",
        "winds", "windy", "wined", "wines", "wings", "winks", "winos",
        "wiped", "wiper", "wipes", "wired", "wirer", "wires", "wiser",
        "wises", "wisps", "wispy", "witch", "wites", "withe", "withy",
        "witty", "wived", "wiver", "wives", "wizen", "wizes", "woads",
        "woken", "wolds", "wolfs", "woman", "wombs", "women", "womyn",
        "wonks", "wonky", "woods", "woody", "wooed", "wooer", "woofs",
        "wools", "wooly", "woozy", "words", "wordy", "works", "world",
        "worms", "wormy", "worry", "worse", "worst", "worth", "worts",
        "would", "wound", "woven", "wowed", "wrack", "wraps", "wrath",
        "wreak", "wreck", "wrens", "wrest", "wrier", "wring", "wrist",
        "write", "writs", "wrong", "wrote", "wroth", "wrung", "wryly",
        "wurst", "xebec", "xenia", "xenon", "xeric", "xerus", "xylem",
        "xysts", "yacht", "yacks", "yagis", "yahoo", "yanks", "yards",
        "yarns", "yawls", "yawns", "yawps", "yeahs", "yearn", "years",
        "yeast", "yecch", "yells", "yelps", "yenta", "yetis", "yield",
        "yikes", "yipes", "yippy", "yodel", "yodhs", "yodle", "yogas",
        "yogic", "yogis", "yoked", "yokel", "yokes", "yolks", "yonic",
        "yonis", "yores", "young", "yours", "youse", "youth", "yowie",
        "yowls", "yucca", "yucks", "yucky", "yummy", "yurts", "zarfs",
        "zaxes", "zayin", "zeals", "zebec", "zebra", "zeins", "zeros",
        "zests", "zesty", "zetas", "zibet", "zilch", "zills", "zincs",
        "zines", "zings", "zingy", "zippy", "zitis", "zlote", "zloty",
        "zoaea", "zoeae", "zoeas", "zombi", "zonal", "zoned", "zoner",
        "zones", "zonks", "zooey", "zooid", "zooks", "zooms", "zoons",
        "zoril", "zowie", "zymes"
    };

    ArrayList<String> wordlist = new ArrayList<>();


    @FXML
    private Label label0;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;
    @FXML
    private Label label7;
    @FXML
    private Label label8;
    @FXML
    private Label label9;
    @FXML
    private Label label10;
    @FXML
    private Label label11;
    @FXML
    private Label label12;
    @FXML
    private Label label13;
    @FXML
    private Label label14;
    @FXML
    private Label label15;
    @FXML
    private Label label16;
    @FXML
    private Label label17;
    @FXML
    private Label label18;
    @FXML
    private Label label19;
    @FXML
    private Label label20;
    @FXML
    private Label label21;
    @FXML
    private Label label22;
    @FXML
    private Label label23;
    @FXML
    private Label label24;
    @FXML
    private Label label25;
    @FXML
    private Label label26;
    @FXML
    private Label label27;
    @FXML
    private Label label28;
    @FXML
    private Label label29;
    @FXML
    private Label title;
    @FXML
    private VBox background;


    // attributes

    // winning word that the user is trying to guess
    private String winword;
    // int that represents what turn the user is on

    private int boxcounter;

    private Color textcolor;
    private Color backgroundcolor;
    private Color wrongcolor = Color.GRAY;
    private Color halfright = Color.YELLOW;
    private boolean colortoggle = true;

    private int rowcounter;
    private boolean isgamerunning;
    ArrayList<Label> labellist = new ArrayList<>();

    public void initialize() {

        labellist = new ArrayList<Label>();
        wordlist = new ArrayList<String>();
        isgamerunning = true;
        boxcounter = 0;
        rowcounter = 0;
        wordlist.addAll(Arrays.asList(words));

        selectWord();
        labellist.add(label0);
        labellist.add(label1);
        labellist.add(label2);
        labellist.add(label3);
        labellist.add(label4);
        labellist.add(label5);
        labellist.add(label6);
        labellist.add(label7);
        labellist.add(label8);
        labellist.add(label9);
        labellist.add(label10);
        labellist.add(label11);
        labellist.add(label12);
        labellist.add(label13);
        labellist.add(label14);
        labellist.add(label15);
        labellist.add(label16);
        labellist.add(label17);
        labellist.add(label18);
        labellist.add(label19);
        labellist.add(label20);
        labellist.add(label21);
        labellist.add(label22);
        labellist.add(label23);
        labellist.add(label24);
        labellist.add(label25);
        labellist.add(label26);
        labellist.add(label27);
        labellist.add(label28);
        labellist.add(label29);

    }

    public void userinput(String input) {
        if (!isgamerunning && input.equals("ENTER")) {
            reset();
        }
        else {
            if (input != "BACK_SPACE") {
                if (input != "ENTER") {
                    if (input.length() == 1) {
                        labellist.get(boxcounter).setText(input);
                        if (boxcounter != 29 && boxcounter != (rowcounter + 1)*5 -1) {
                            boxcounter++;
                        }
                    }
                } else {
                    // all of this code runs once someone presses enter
                    String guess = "";
                    for (int i = rowcounter * 5; i < rowcounter * 5 + 5; i++) {
                        String letter = labellist.get(i).getText();
                        if (!letter.isEmpty()) {
                            guess += letter;
                        }


                    }
                    // turns the guess to lower case so it can be correctly put against the wordlist
                    guess = guess.toLowerCase();
                    // if the guess is the proper length, continue with the checks
                    if (guess.length() == 5) {
                        if (guessChecker(guess)) {
                            // if the guess is valid, check and see if the guess is the winning guess
                            if (checkWin(guess)) {
                                title.setTextFill(Color.GREEN);
                                // if it is the winning guess, make the letters green and end the game
                                for (int i = rowcounter * 5; i < rowcounter * 5 + 5; i++) {
                                    labellist.get(i).setBackground(Background.fill(Color.GREEN));
                                    isgamerunning = false;
                                }
                            }
                            else {
                                // if the guess is not the winning word, call the pos function
                                int[] positions = checkletterpos(guess);
                                for (int i = rowcounter * 5; i < rowcounter * 5 + 5; i++) {
                                    System.out.println(i);
                                    System.out.println(positions);
                                    Label selectedbox = labellist.get(i);
                                    if (positions[i - rowcounter*5] == 2) {
                                        selectedbox.setBackground(Background.fill(Color.GREEN));
                                    } else if (positions[i - rowcounter*5] == 1){
                                        selectedbox.setBackground(Background.fill(halfright));
                                    } else {
                                        selectedbox.setBackground(Background.fill(wrongcolor));
                                    }

                                    if (rowcounter == 5) {
                                        isgamerunning = false;
                                    }

                                }
                                rowcounter++;
                                boxcounter++;

                            }

                        } else {
                            boxcounter = boxcounter - 4;
                            for (int i = rowcounter * 5; i < rowcounter * 5 + 5; i++) {
                                labellist.get(i).setText("");
                        }
                        }

                    }
                }

            } else {
                labellist.get(boxcounter).setText("");
                if (boxcounter != 0 && boxcounter != rowcounter *5) {
                    boxcounter--;
                }

            }
        }


    }

    public void reset(){
        for(int i = 0; i < labellist.size(); i++){
            labellist.get(i).setText("");
            labellist.get(i).setBackground(Background.fill(backgroundcolor));
            title.setTextFill(textcolor);
                }

            initialize();
    }

    public void selectWord() {
        Random random = new Random();
        int MAX_LEN = wordlist.size();
        int MIN_LEN = 0;

        int index = random.nextInt(MIN_LEN, MAX_LEN);
        winword = wordlist.get(index);
    }


    public boolean guessChecker(String word) {
        if (wordlist.contains(word)) {
            return true;
        }
        return false;
    }

    public boolean checkWin(String guess) {
        if (guess.equals(winword)) {
            return true;
        }
        return false;
    }

    public int[] checkletterpos(String guess){
        int[] intarray = new int[5];
            for (int i = 0; i < guess.length(); i++){
                char guessl = guess.charAt(i);
                char winl = winword.charAt(i);
                if(guessl == winl){
                    intarray[i] = 2;
                } // if the char is in the winning word but the wrong spot
                else if(winword.indexOf(guessl) != -1){
                    intarray[i] = 1;
                }
                else { // if the char is not present anywhere
                    intarray[i] = 0;
                }

            }
            return intarray;
    }
    public void toggleColor(){
        if(colortoggle){
            textcolor = Color.WHITE;
            backgroundcolor = Color.GRAY;
            wrongcolor = Color.BLACK;
            halfright = Color.rgb(140, 100, 0);
            colortoggle = false;
        } else {
            textcolor = Color.BLACK;
            backgroundcolor = Color.WHITE;
            wrongcolor = Color.GRAY;
            halfright = Color.YELLOW;
            colortoggle = true;
        }

        background.setBackground(Background.fill(backgroundcolor));
        title.setTextFill(textcolor);
        for(Label label : labellist){
            label.setTextFill(textcolor);

            if(label.getBackground() == Background.fill(Color.WHITE) || label.getBackground() == Background.fill(Color.BLACK)){
                label.setBackground(Background.fill(backgroundcolor));
            }
        }
    }

}


