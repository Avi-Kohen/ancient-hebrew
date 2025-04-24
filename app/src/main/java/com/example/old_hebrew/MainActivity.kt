class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OldHebrewTheme {
                val navController = rememberNavController()
                Scaffold(
                    bottomBar = { BottomNavBar(navController) }
                ) { padding ->
                    NavHost(
                        navController,
                        startDestination = "compare",
                        Modifier.padding(padding)
                    ) {
                        composable("compare") { CompareScreen() }
                        composable("history") { HistoryScreen() }
                        composable("converter") { ConverterScreen() }
                        composable("camera") { CameraScreen() }
                    }
                }
            }
        }
    }
}
