    Proxy Pattern: Real Estate Image System
Scenario
Real estate agents upload high-resolution property images. For better performance, full-resolution images are only loaded when a user zooms in.
Components
Image (interface)
RealImage (loads full-res image)
ProxyImage (lazy-loads the image on demand)
ImageUploader (protection proxy to control image uploads)
Benefits
Reduces memory usage by lazy-loading
Improves performance on image listing pages
Adds basic security to image upload logic
    Flyweight Pattern: Map Markers
Scenario
An app вisplays thousands of map markers (e.g., hospitals, restaurants). Each marker shares styles like icons and colors.
Components
MarkerStyle (flyweight class for shared styles)
LocationMarker (uses shared style instead of duplicating)
Benefits
Saves memory by reusing style objects
Logs unique styles used vs. total markers
Efficient for rendering large datasets
