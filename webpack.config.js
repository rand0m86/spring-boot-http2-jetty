// var path = require('path');
const ExtractTextPlugin = require("extract-text-webpack-plugin");

module.exports = {
    entry: {
        // vendor: 'spectre.css',
        app: './src/main/resources/static/js/index.js'
    },
    output: {
        filename: '[name].js',
        // path: path.resolve(__dirname, )
        path: './target/classes/static/build'
    },
    module: {
        rules: [{
            test: /\.css$/,
            use: ExtractTextPlugin.extract({
                use: 'css-loader'
            })
        }, {
            test: /\.less$/,
            use: ExtractTextPlugin.extract({
                use: [
                    // 'style-loader',
                    'css-loader',
                    'less-loader'
                ]
            })
        }, {
            test: /\.woff(\?v=\d+\.\d+\.\d+)?|$\.woff2(\?v=\d+\.\d+\.\d+)?$|\.ttf(\?v=\d+\.\d+\.\d+)?$/,
            use: 'url-loader'
            // loader: "url?limit=10000&mimetype=application/font-woff"
        }, {
            test: /\.svg(\?v=\d+\.\d+\.\d+)?$/,
            // use: "url?limit=10000&mimetype=image/svg+xml"
            use: 'url-loader'
        }, {
            test: /\.eot(\?v=\d+\.\d+\.\d+)?$/,
            use: 'file-loader'
        }]
    },
    plugins: [
        new ExtractTextPlugin({
            filename: 'styles.css',
            allChunks: true
        })
    ]


};