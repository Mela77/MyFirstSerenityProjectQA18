package org.fasttrackit.features;

import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.SearchSteps;
import org.fasttrackit.utils.BaseTest;
import org.junit.Test;

public class SearchTest extends BaseTest {

    @Steps
    private SearchSteps searchSteps;

    @Test
    public void testSearchForProduct(){
        searchSteps.navigateToSearchBar();
        searchSteps.searchProduct("necklace");
        searchSteps.clickSearch();
        searchSteps.checkSearchResults("SEARCH RESULTS FOR 'NECKLACE'");
    }

}
