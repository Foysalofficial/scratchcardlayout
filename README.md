# ScratchCardLayout

## A simple Android library for scratch card reveal kind of effect


## Features:

 - Scratch card effect to ANY view.
 - Just wrap your existing complex Layout with ScratchCardLayout.
 - CardView based library. So All styling of CardView is available.
 - Set scratch brush width.
 - Enable/Disable scratching effect
 - Set Drawable to be scratched (color / image).
 - Set the percentage of scratch when you should be revealing full layout.
 - Get callbacks when scratching starts, progresses (with a percentage) and when stops..
 
 
# Demonstration
|Demo scratchCardLayout|
|:---:|
|![](art/demoScratchCardLayout.gif)|

 
# Usage
## Dependency:

 
 ```
 dependencies {
      implementation 'com.github.Foysalofficial:scratchcardlayout:2.0'
 }
 ```
 
 ## XML Usage
 ```xml
  <com.foysaltech.scratchcardlayout.ui.ScratchCardLayout
         android:id="@+id/scratchCard"
         android:layout_width="250dp"
         android:layout_height="250dp"
         android:layout_centerInParent="true"
         app:scratchWidth="40dp"
         app:scratchEnabled="true"
         app:scratchDrawable="@drawable/your_drawable"
         app:scratchRevealFullAtPercent="100">
 
         <!--Your complex view here-->
  </com.foysaltech.scratchcardlayout.ui.ScratchCardLayout>     
 ```
 
 ## Java Usage
 ```java
        //Get view reference
        ScratchCardLayout scratchCardLayout = findViewById(R.id.scratchCard);
        
        //Set the drawable (programmatically)
        scratchCardLayout.setScratchDrawable(getResources().getDrawable(R.drawable.car));
        
        //Set scratch brush width
        scratchCardLayout.setScratchWidth(30f);
        
        //Reveal full layout when some percent of the view is scratched
        scratchCardLayout.setRevealFullAtPercent(40);
        
        //Scratching enable/disable
        scratchCardLayout.setScratchEnabled(true);
        
        //Remove all scratch made till now
        scratchCardLayout.resetScratch();

        //Reveal scratch card (Shows the layout underneath the scratch)
        scratchCardLayout.revealScratch();
 ``` 
 
 ### Listeners available
          
Implement the given interface and override these stuff:

```java

          //Implement this to your class
          yourClass extends someBaseClass implements ScratchListener
          
          //Set the listener
          scratchCardLayout.setScratchListener(this);
            
          //You'll have three main callback methods as scratch listeners
          //Scratch started
          void onScratchStarted();
            
          //Scracth progress (NOTE: not guaranteed to be exact percent. consider it like atleast this much percent has been scratched)
          void onScratchProgress(ScratchCardLayout scratchCardLayout, int atLeastScratchedPercent);
            
          //Scratch completed
          void onScratchComplete();
  ``` 
 
 ## Note
 ```
 - The progress is the value guaranteeing that the mentioned percent is atleast scratched. NOT THE EXACT PERCENTAGE (for performance reasaons)
 ```
 
 License
 -------
 
     Copyright 2025 by Foysal Tech
 
     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
