package com.example.udemyjavacourse;

import static org.junit.Assert.assertEquals;

import com.example.udemyjavacourse.udemy_section_five.UdemySectionFiveHolderInterface;
import com.example.udemyjavacourse.udemy_section_five.UdemySectionFivePresenter;
import com.example.udemyjavacourse.udemy_section_five.UdemySectionFiveViewHolder;
import com.example.udemyjavacourse.udemy_section_five.UdemySectionFiveViewInterface;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class OverloadMethodChallengeTests {

    @Mock
    private UdemySectionFiveViewInterface view;

    @Mock
    private UdemySectionFiveHolderInterface holder;

    private UdemySectionFivePresenter presenter;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        presenter = new UdemySectionFivePresenter(view);
        presenter.setUdemySectionViewHolder(holder);
    }

    // METHOD: convertToCentimeters(int height)
    // RETURNS: the height * 2.54
    @Test
    public void testConvertToCentimetersWithHeight() {
        assertEquals(175.26, presenter.convertToCentimeters(69), 0);
    }

    // METHOD: convertToCentimeters(int feet, int inches)
    // RETURNS: convertToCentimeters(int height)
    @Test
    public void testConvertToCentimetersWithFeetAndInches() {
        assertEquals(175.26, presenter.convertToCentimeters(5, 9), 0);
    }

    @Test
    public void testOverloadMethodChallenge() {

        int [] parameters = new int[] { 5, 9 };

        presenter.overLoadMethodChallenge(parameters);

        Mockito.verify(holder).setMethodOverloadChallengeInput("175.26");

    }
}
